package com.G3Tingeso.PrivateServices.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Docente;

/**
 * Docente_RepositoryImp
 */
@Repository
public class Docente_RepositoryImp implements Docente_Repository{
    
    @Autowired
    private Sql2o sql2o;

    @Override
    public int countDocente() {
        int total = 0;
        try(Connection conn = sql2o.open()){
            total = conn.createQuery("SELECT COUNT(*) FROM docente").executeScalar(Integer.class);
        }
        return total;
    }

    @Override
    public List<Docente> getAllDocentes() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from docente ORDER BY id")
                    .executeAndFetch(Docente.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Docente getDocente(int id) {
        String sql = "SELECT * FROM docente where id=:id";

		try (Connection con = sql2o.open()) {
			return con.createQuery(sql)
				.addParameter("id", id)
				.executeAndFetchFirst(Docente.class);
		}catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean createDocente(Docente docente) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("insert into docente (nombre,id_rol_docente)"+
            " values (:nombre,:id_rol_docente)", true)     
                    .addParameter("nombre", docente.getNombre())
                    .addParameter("id_rol_docente", docente.getId_rol_docente())
                    .executeUpdate().getKey();
            return true;      
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteDocente(int id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM docente WHERE id = :id").addParameter("id", id)
            .executeUpdate();
            return true; 
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateDocente(Docente docente) {
        String updateSql = "UPDATE docente SET "+
        "nombre = :nombre, "+
        "id_rol_docente = :id_rol_docente "+
        "WHERE id = :id";
        try (Connection con = sql2o.open()) {   
            con.createQuery(updateSql)
                .addParameter("id", docente.getId())
                .addParameter("nombre", docente.getNombre())
                .addParameter("id_rol_docente", docente.getId_rol_docente())
                .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    
}