package com.G3Tingeso.PrivateServices.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Rol_docente;

/**
 * Rol_docente_RepositoryImp
 */
@Repository
public class Rol_docente_RepositoryImp implements Rol_docente_Repository{
    
    @Autowired
    private Sql2o sql2o;

    @Override
    public int countRol_docente() {
        int total = 0;
        try(Connection conn = sql2o.open()){
            total = conn.createQuery("SELECT COUNT(*) FROM rol_docente").executeScalar(Integer.class);
        }
        return total;
    }

    @Override
    public List<Rol_docente> getAllRol_docentes() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from rol_docente ORDER BY id")
                    .executeAndFetch(Rol_docente.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Rol_docente getRol_docente(int id) {
        String sql = "SELECT * FROM rol_docente where id=:id";

		try (Connection con = sql2o.open()) {
			return con.createQuery(sql)
				.addParameter("id", id)
				.executeAndFetchFirst(Rol_docente.class);
		}catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean createRol_docente(Rol_docente rol_docente) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("insert into rol_docente (descripcion,id_docente)"+
            " values (:descripcion,:id_docente,)", true)     
                    .addParameter("descripcion", rol_docente.getDescripcion())
                    .addParameter("id_docente", rol_docente.getId_docente())
                    .executeUpdate().getKey();
            return true;      
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteRol_docente(int id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM rol_docente WHERE id = :id").addParameter("id", id)
            .executeUpdate();
            return true; 
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateRol_docente(Rol_docente rol_docente) {
        String updateSql = "UPDATE rol_docente SET "+
        "descripcion = :descripcion, "+
        "id_docente = :id_docente "+
        "WHERE id = :id";
        try (Connection con = sql2o.open()) {   
            con.createQuery(updateSql)
                .addParameter("id", rol_docente.getId())
                .addParameter("descripcion", rol_docente.getDescripcion())
                .addParameter("id_docente", rol_docente.getId_docente())
                .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    
}