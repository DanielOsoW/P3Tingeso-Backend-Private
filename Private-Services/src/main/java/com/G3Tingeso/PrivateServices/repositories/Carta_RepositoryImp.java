package com.G3Tingeso.PrivateServices.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Carta;

/**
 * Carta_RepositoryImp
 */
@Repository
public class Carta_RepositoryImp implements Carta_Repository{
    
    @Autowired
    private Sql2o sql2o;

    @Override
    public int countCarta() {
        int total = 0;
        try(Connection conn = sql2o.open()){
            total = conn.createQuery("SELECT COUNT(*) FROM carta").executeScalar(Integer.class);
        }
        return total;
    }

    @Override
    public List<Carta> getAllCartas() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from carta ORDER BY id")
                    .executeAndFetch(Carta.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Carta getCarta(int id) {
        String sql = "SELECT * FROM carta where id=:id";

		try (Connection con = sql2o.open()) {
			return con.createQuery(sql)
				.addParameter("id", id)
				.executeAndFetchFirst(Carta.class);
		}catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean createCarta(Carta carta) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("insert into carta (descripcion,id_docente,id_postulante)"+
            " values (:descripcion,:id_docente,:id_postulante)", true)     
                    .addParameter("descripcion", carta.getDescripcion())
                    .addParameter("id_docente", carta.getId_docente())
                    .addParameter("id_postulante", carta.getId_postulante())
                    .executeUpdate().getKey();
            return true;      
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteCarta(int id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM carta WHERE id = :id").addParameter("id", id)
            .executeUpdate();
            return true; 
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateCarta(Carta carta) {
        String updateSql = "UPDATE carta SET "+
        "descripcion = :descripcion, "+
        "id_docente = :id_docente, "+
        "id_postulante = :id_postulante "+
        "WHERE id = :id";
        try (Connection con = sql2o.open()) {   
            con.createQuery(updateSql)
                .addParameter("id", carta.getId())
                .addParameter("descripcion", carta.getDescripcion())
                .addParameter("id_docente",carta.getId_docente())
                .addParameter("id_postulante", carta.getId_postulante())
                .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }


    
}