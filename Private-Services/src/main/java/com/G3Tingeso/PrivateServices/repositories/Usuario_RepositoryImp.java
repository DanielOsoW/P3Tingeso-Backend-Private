package com.G3Tingeso.PrivateServices.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Usuario;

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