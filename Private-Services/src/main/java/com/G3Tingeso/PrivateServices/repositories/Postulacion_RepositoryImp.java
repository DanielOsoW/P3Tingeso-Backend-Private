package com.G3Tingeso.PrivateServices.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Postulacion;

/**
 * Postulacion_RepositoryImp
 */
@Repository
public class Postulacion_RepositoryImp implements Postulacion_Repository{
    
    @Autowired
    private Sql2o sql2o;

    @Override
    public int countPostulacion() {
        int total = 0;
        try(Connection conn = sql2o.open()){
            total = conn.createQuery("SELECT COUNT(*) FROM postulacion").executeScalar(Integer.class);
        }
        return total;
    }

    @Override
    public List<Postulacion> getAllPostulacions() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from postulacion ORDER BY id")
                    .executeAndFetch(Postulacion.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Postulacion getPostulacion(int id) {
        String sql = "SELECT * FROM postulacion where id=:id";

		try (Connection con = sql2o.open()) {
			return con.createQuery(sql)
				.addParameter("id", id)
				.executeAndFetchFirst(Postulacion.class);
		}catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean createPostulacion(Postulacion postulacion) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("insert into postulacion (comentario,src_doc,id_postulante,id_diplomado)"+
            " values (:comentario,:src_doc,:id_postulante, :id_diplomado)", true)     
                    .addParameter("comentario", postulacion.getComentario())
                    .addParameter("src_doc", postulacion.getSrc_doc())
                    .addParameter("id_postulante", postulacion.getId_postulante())                    
                    .addParameter("id_diplomado", postulacion.getId_diplomado())
                    .executeUpdate().getKey();
            return true;      
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deletePostulacion(int id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM postulacion WHERE id = :id").addParameter("id", id)
            .executeUpdate();
            return true; 
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updatePostulacion(Postulacion postulacion) {
        String updateSql = "UPDATE postulacion SET "+
        "comentario = :comentario, "+
        "src_doc = :src_doc, "+
        "id_postulante = :id_postulante, "+
        "id_diplomado = :id_diplomado "+
        "WHERE id = :id";
        try (Connection con = sql2o.open()) {   
            con.createQuery(updateSql)
                .addParameter("id", postulacion.getId())
                .addParameter("comentario", postulacion.getComentario())
                .addParameter("src_doc", postulacion.getSrc_doc())
                .addParameter("id_postulante", postulacion.getId_postulante())                    
                .addParameter("id_diplomado", postulacion.getId_diplomado())
                .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    
}