package com.G3Tingeso.PrivateServices.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Diplomado_docente;

@Repository
public class Diplomado_docente_RepositoryImp implements Diplomado_docente_Repository{
 
     
    @Autowired
    private Sql2o sql2o;

    @Override
    public int countDiplomado_docente() {
        int total = 0;
        try(Connection conn = sql2o.open()){
            total = conn.createQuery("SELECT COUNT(*) FROM diplomado_docente").executeScalar(Integer.class);
        }
        return total;
    }

    @Override
    public List<Diplomado_docente> getAllDiplomado_docentes() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from diplomado_docente ORDER BY id")
                    .executeAndFetch(Diplomado_docente.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Diplomado_docente getDiplomado_docente(int id) {
        String sql = "SELECT * FROM diplomado_docente where id=:id";
		try (Connection con = sql2o.open()) {
			return con.createQuery(sql)
				.addParameter("id", id)
				.executeAndFetchFirst(Diplomado_docente.class);
		}catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean createDiplomado_docente(Diplomado_docente diplomado_docente) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("insert into diplomado_docente (id_docente,id_diplomado)"+
            " values (:id_docente,:id_diplomado)", true)     
                    .addParameter("id_docente", diplomado_docente.getId_docente())
                    .addParameter("id_diplomado", diplomado_docente.getId_diplomado())
                    .executeUpdate().getKey();
            return true;      
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteDiplomado_docente(int id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM diplomado_docente WHERE id = :id").addParameter("id", id)
            .executeUpdate();
            return true; 
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateDiplomado_docente(Diplomado_docente diplomado_docente) {
        String updateSql = "UPDATE diplomado_docente SET "+
        "id_docente = :id_docente, "+
        "id_diplomado = :id_diplomado "+
        "WHERE id = :id";
        try (Connection con = sql2o.open()) {   
            con.createQuery(updateSql)
                .addParameter("id", diplomado_docente.getId())
                .addParameter("id_docente", diplomado_docente.getId_docente())
                .addParameter("id_diplomado", diplomado_docente.getId_diplomado())
                .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }



}
