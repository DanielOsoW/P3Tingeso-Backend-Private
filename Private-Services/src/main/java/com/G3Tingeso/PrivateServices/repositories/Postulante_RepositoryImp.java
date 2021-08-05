package com.G3Tingeso.PrivateServices.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Postulante;

@Repository
public class Postulante_RepositoryImp implements Postulante_Repository  {
    
    @Autowired
    private Sql2o sql2o;

    @Override
    public int countPostulante() {
        int total = 0;
        try(Connection conn = sql2o.open()){
            total = conn.createQuery("SELECT COUNT(*) FROM postulante").executeScalar(Integer.class);
        }
        return total;
    }

    @Override
    public List<Postulante> getAllPostulantes() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from postulante ORDER BY id")
                    .executeAndFetch(Postulante.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Postulante getPostulante(int id) {
        String sql = "SELECT * FROM postulante where id=:id";

		try (Connection con = sql2o.open()) {
			return con.createQuery(sql)
				.addParameter("id", id)
				.executeAndFetchFirst(Postulante.class);
		}catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean createPostulante(Postulante postulante) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("insert into postulante (nombre,correo,num_telefono)"+
            " values (:nombre,:correo,:num_telefono)", true)     
                    .addParameter("nombre", postulante.getNombre())
                    .addParameter("correo", postulante.getCorreo())
                    .addParameter("num_telefono", postulante.getNum_telefono())
                    .executeUpdate().getKey();
            return true;      
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deletePostulante(int id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM postulante WHERE id = :id").addParameter("id", id)
            .executeUpdate();
            return true; 
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updatePostulante(Postulante postulante) {
        String updateSql = "UPDATE postulante SET "+
        "nombre = :nombre, "+
        "correo = :correo, "+
        "num_telefono = :num_telefono "+
        "WHERE id = :id";
        try (Connection con = sql2o.open()) {   
            con.createQuery(updateSql)
                .addParameter("id", postulante.getId())
                .addParameter("nombre", postulante.getNombre())
                .addParameter("correo",postulante.getCorreo())
                .addParameter("num_telefono", postulante.getNum_telefono())
                .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Postulante> getPostulantesByDiplomado(int id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from postulante pt, postulacion pn, diplomado d WHERE pn.id_postulante=pt.id AND pn.id_diplomado=d.id id=:id")
                    .addParameter("id", id)
                    .executeAndFetch(Postulante.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


}
