package com.G3Tingeso.PrivateServices.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Rol;

/**
 * Rol_RepositoryImp
 */
@Repository
public class Rol_RepositoryImp implements Rol_Repository{

        
    @Autowired
    private Sql2o sql2o;

    @Override
    public int countRol() {
        int total = 0;
        try(Connection conn = sql2o.open()){
            total = conn.createQuery("SELECT COUNT(*) FROM rol").executeScalar(Integer.class);
        }
        return total;
    }

    @Override
    public List<Rol> getAllRols() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from rol ORDER BY id")
                    .executeAndFetch(Rol.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Rol getRol(int id) {
        String sql = "SELECT * FROM rol where id=:id";

		try (Connection con = sql2o.open()) {
			return con.createQuery(sql)
				.addParameter("id", id)
				.executeAndFetchFirst(Rol.class);
		}catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean createRol(Rol rol) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("insert into rol (descripcion)"+
            " values (:descripcion)", true)     
                    .addParameter("descripcion", rol.getDescripcion())
                    .executeUpdate().getKey();
            return true;      
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteRol(int id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM rol WHERE id = :id").addParameter("id", id)
            .executeUpdate();
            return true; 
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateRol(Rol rol) {
        String updateSql = "UPDATE rol SET "+
        "descripcion = :descripcion "+
        "WHERE id = :id";
        try (Connection con = sql2o.open()) {   
            con.createQuery(updateSql)
                .addParameter("id", rol.getId())
                .addParameter("descripcion", rol.getDescripcion())
                .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

}