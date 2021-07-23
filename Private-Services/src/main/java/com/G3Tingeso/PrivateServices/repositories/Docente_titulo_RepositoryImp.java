package com.G3Tingeso.PrivateServices.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Docente_titulo;

@Repository
public class Docente_titulo_RepositoryImp implements Docente_titulo_Repository{
    
    @Autowired
    private Sql2o sql2o;

    @Override
    public int countDocente_titulo() {
        int total = 0;
        try(Connection conn = sql2o.open()){
            total = conn.createQuery("SELECT COUNT(*) FROM docente_titulo").executeScalar(Integer.class);
        }
        return total;
    }

    @Override
    public List<Docente_titulo> getAllDocente_titulos() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from docente_titulo ORDER BY id")
                    .executeAndFetch(Docente_titulo.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Docente_titulo getDocente_titulo(int id) {
        String sql = "SELECT * FROM docente_titulo where id=:id";

		try (Connection con = sql2o.open()) {
			return con.createQuery(sql)
				.addParameter("id", id)
				.executeAndFetchFirst(Docente_titulo.class);
		}catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean createDocente_titulo(Docente_titulo docente_titulo) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("insert into docente_titulo (id_docente,id_titulo)"+
            " values (:id_docente,:id_titulo)", true)     
                    .addParameter("id_docente", docente_titulo.getId_docente())
                    .addParameter("id_titulo", docente_titulo.getId_titulo())
                    .executeUpdate().getKey();
            return true;      
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteDocente_titulo(int id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM docente_titulo WHERE id = :id").addParameter("id", id)
            .executeUpdate();
            return true; 
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateDocente_titulo(Docente_titulo docente_titulo) {
        String updateSql = "UPDATE docente_titulo SET "+
        "id_docente = :id_docente, "+
        "id_titulo = :id_titulo "+
        "WHERE id = :id";
        try (Connection con = sql2o.open()) {   
            con.createQuery(updateSql)
                .addParameter("id", docente_titulo.getId())
                .addParameter("id_docente", docente_titulo.getId_docente())
                .addParameter("id_titulo", docente_titulo.getId_titulo())
                .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }


}
