package com.G3Tingeso.PrivateServices.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Informacion;

/**
 * Informacion_RepositoryImp
 */
@Repository
public class Informacion_RepositoryImp implements Informacion_Repository{
    
    @Autowired
    private Sql2o sql2o;

    @Override
    public int countInformacion() {
        int total = 0;
        try(Connection conn = sql2o.open()){
            total = conn.createQuery("SELECT COUNT(*) FROM informacion").executeScalar(Integer.class);
        }
        return total;
    }

    @Override
    public List<Informacion> getAllInformacions() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from informacion ORDER BY id")
                    .executeAndFetch(Informacion.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Informacion getInformacion(int id) {
        String sql = "SELECT * FROM informacion where id=:id";

		try (Connection con = sql2o.open()) {
			return con.createQuery(sql)
				.addParameter("id", id)
				.executeAndFetchFirst(Informacion.class);
		}catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean createInformacion(Informacion informacion) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("insert into informacion (nombre,contenido,id_diplomado)"+
            " values (:nombre,:contenido,:id_diplomado)", true)     
                    .addParameter("nombre", informacion.getNombre())
                    .addParameter("contenido", informacion.getContenido())
                    .addParameter("id_diplomado", informacion.getId_diplomado())
                    .executeUpdate().getKey();
            return true;      
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteInformacion(int id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM informacion WHERE id = :id").addParameter("id", id)
            .executeUpdate();
            return true; 
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateInformacion(Informacion informacion) {
        String updateSql = "UPDATE informacion SET "+
        "nombre = :nombre, "+
        "contenido = :contenido, "+
        "id_diplomado = :id_diplomado "+
        "WHERE id = :id";
        try (Connection con = sql2o.open()) {   
            con.createQuery(updateSql)
                .addParameter("id", informacion.getId())
                .addParameter("nombre", informacion.getNombre())
                .addParameter("contenido", informacion.getContenido())
                .addParameter("id_diplomado", informacion.getId_diplomado())
                .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    



}