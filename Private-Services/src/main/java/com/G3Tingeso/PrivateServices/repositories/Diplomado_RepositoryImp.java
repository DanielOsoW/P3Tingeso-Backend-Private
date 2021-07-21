package com.G3Tingeso.PrivateServices.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Diplomado;

@Repository
public class Diplomado_RepositoryImp implements Diplomado_Repository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public int countDiplomado() {
        int total = 0;
        try(Connection conn = sql2o.open()){
            total = conn.createQuery("SELECT COUNT(*) FROM diplomado").executeScalar(Integer.class);
        }
        return total;
    }

    @Override
    public List<Diplomado> getAllDiplomados() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from diplomado")
                    .executeAndFetch(Diplomado.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Diplomado getDiplomado(int id) {
        String sql = "SELECT * FROM diplomado where id=:id";

		try (Connection con = sql2o.open()) {
			return con.createQuery(sql)
				.addParameter("id", id)
				.executeAndFetchFirst(Diplomado.class);
		}catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean createDiplomado(Diplomado diplomado) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("insert into diplomado (titulo,introduccion,objetivo,descripcion,horas,cursos,imagen)"+
            " values (:titulo,:introduccion,:objetivo,:descripcion,:horas,:cursos,:imagen)", true)     
                    .addParameter("titulo", diplomado.getTitulo())
                    .addParameter("introduccion", diplomado.getIntroduccion())
                    .addParameter("objetivo", diplomado.getObjetivo())
                    .addParameter("descripcion", diplomado.getDescripcion())
                    .addParameter("horas", diplomado.getHoras())
                    .addParameter("cursos", diplomado.getCursos())
                    .addParameter("imagen", diplomado.getImagen())
                    .executeUpdate().getKey();
            return true;      
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteDiplomado(int id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean updateDiplomado(Diplomado diplomado) {
        // TODO Auto-generated method stub
        return false;
    }


}
