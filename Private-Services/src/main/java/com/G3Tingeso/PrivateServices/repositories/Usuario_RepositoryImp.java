package com.G3Tingeso.PrivateServices.repositories;
import java.sql.Date;
import java.time.Instant;
import java.util.HashMap;
import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Usuario;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

/**
 * Usuario_RepositoryImp
 */
@Repository
public class Usuario_RepositoryImp implements Usuario_Repository{
    
    @Autowired
    private Sql2o sql2o;

    @Override
    public int countUsuario() {
        int total = 0;
        try(Connection conn = sql2o.open()){
            total = conn.createQuery("SELECT COUNT(*) FROM usuario").executeScalar(Integer.class);
        }
        return total;
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from usuario ORDER BY id")
                    .executeAndFetch(Usuario.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Usuario getUsuario(int id) {
        String sql = "SELECT * FROM usuario where id=:id";

		try (Connection con = sql2o.open()) {
			return con.createQuery(sql)
				.addParameter("id", id)
				.executeAndFetchFirst(Usuario.class);
		}catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Usuario autenticarUsuario(String email, String password) {
        String sql = "SELECT * FROM usuario WHERE email= :email AND password= :password";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql)
                    .addParameter("email", email)
                    .addParameter("password", password)
                    .executeAndFetchFirst(Usuario.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String getLogin(String email, String password) {
        Usuario usuario = autenticarUsuario(email, password);
        if (usuario != null) {
            try (Connection con = sql2o.open()) {
                //The JWT signature algorithm we will be using to sign the token
                SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.ES256;
                SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
                //Creating the Header of
                HashMap<String, Object> header = new HashMap<String, Object>();
                header.put("alg", signatureAlgorithm.toString()); //HS256
                header.put("typ", "JWT");
                JwtBuilder tokenJWT = Jwts
                        .builder()
                        .setHeader(header)
                        .claim("email", usuario.getEmail())
                        .claim("password", usuario.getPassword())
                        // Fri Jun 24 2016 15:33:42 GMT-0400 (EDT)
                        .setIssuedAt(Date.from(Instant.ofEpochSecond(1466796822L)))
                        // Sat Jun 24 2116 15:33:42 GMT-0400 (EDT)
                        .setExpiration(Date.from(Instant.ofEpochSecond(4622470422L))).signWith(key);
                //-------------------------------------------------------------------------------
                //CREATING TOKEN + ADDING HEADER
                //-------------------------------------------------------------------------------
                //Compact the tokenJWT + save the value in tokenJWTString
                String tokenJWTString = tokenJWT.compact();
                System.out.println(tokenJWTString);
                //Response to Request from Controller
                return tokenJWTString;
            } catch (Exception e) {
                System.out.println(e);
                return "Error creating the token JWT" + e;
            }
        }
        else {
            return null;
        }
    }
    @Override
    public boolean createUsuario(Usuario usuario) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("insert into usuario (email,password,id_docente,id_rol)"+
            " values (:email,:password,:id_docente, :id_rol)", true)     
                    .addParameter("email", usuario.getEmail())
                    .addParameter("password", usuario.getPassword())
                    .addParameter("id_docente", usuario.getId_docente())
                    .addParameter("id_rol", usuario.getId_rol())
                    .executeUpdate().getKey();
            return true;      
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteUsuario(int id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM usuario WHERE id = :id").addParameter("id", id)
            .executeUpdate();
            return true; 
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateUsuario(Usuario usuario) {
        String updateSql = "UPDATE usuario SET "+
        "email = :email, "+
        "password = :password, "+
        "id_docente = :id_docente, "+
        "id_rol = :id_rol "+
        "WHERE id = :id";
        try (Connection con = sql2o.open()) {   
            con.createQuery(updateSql)
                .addParameter("id", usuario.getId())
                .addParameter("email", usuario.getEmail())
                .addParameter("password", usuario.getPassword())
                .addParameter("id_docente", usuario.getId_docente())
                .addParameter("id_rol", usuario.getId_rol())
                .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    
}