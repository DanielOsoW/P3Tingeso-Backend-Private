package com.G3Tingeso.PrivateServices.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Titulo;

/**
 * Titulo_RepositoryImp
 */
@Repository
public class Titulo_RepositoryImp implements Titulo_Repository{
    
    @Autowired
    private Sql2o sql2o;

    @Override
    public int countTitulo() {
        int total = 0;
        try(Connection conn = sql2o.open()){
            total = conn.createQuery("SELECT COUNT(*) FROM titulo").executeScalar(Integer.class);
        }
        return total;
    }

    @Override
    public List<Titulo> getAllTitulos() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from titulo ORDER BY id")
                    .executeAndFetch(Titulo.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Titulo getTitulo(int id) {
        String sql = "SELECT * FROM titulo where id=:id";

		try (Connection con = sql2o.open()) {
			return con.createQuery(sql)
				.addParameter("id", id)
				.executeAndFetchFirst(Titulo.class);
		}catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean createTitulo(Titulo titulo) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("insert into titulo (nombre)"+
            " values (:nombre)", true)     
                    .addParameter("nombre", titulo.getNombre())
                    .executeUpdate().getKey();
            return true;      
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteTitulo(int id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM titulo WHERE id = :id").addParameter("id", id)
            .executeUpdate();
            return true; 
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateTitulo(Titulo titulo) {
        String updateSql = "UPDATE titulo SET "+
        "nombre = :nombre "+
        "WHERE id = :id";
        try (Connection con = sql2o.open()) {   
            con.createQuery(updateSql)
                .addParameter("id", titulo.getId())
                .addParameter("nombre", titulo.getNombre())
                .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Titulo> getTitulosDocente(int id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select t.* from titulo t, docente_titulo dt, docente d where t.id = dt.id_titulo and dt.id_docente = d.id and d.id = " + id)
                    .executeAndFetch(Titulo.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    
}