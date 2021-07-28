package com.G3Tingeso.PrivateServices.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Diplomado;
import com.G3Tingeso.PrivateServices.models.Docente;

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
            List<Diplomado> salida= conn.createQuery("select * from diplomado ORDER BY id").executeAndFetch(Diplomado.class);
            return salida;
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
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM diplomado WHERE id = :id").addParameter("id", id)
            .executeUpdate();
            return true; 
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateDiplomado(Diplomado diplomado) {
        String updateSql = "UPDATE diplomado SET "+
        "titulo = :titulo, "+
        "introduccion = :introduccion, "+
        "objetivo = :objetivo, "+
        "descripcion = :descripcion, "+
        "horas = :horas, "+
        "cursos = :cursos, "+
        "imagen = :imagen "+
        "WHERE id = :id";
        try (Connection con = sql2o.open()) {   
            con.createQuery(updateSql)
                .addParameter("titulo", diplomado.getTitulo())
                .addParameter("introduccion", diplomado.getIntroduccion())
                .addParameter("objetivo", diplomado.getObjetivo())
                .addParameter("descripcion", diplomado.getDescripcion())
                .addParameter("horas", diplomado.getHoras())
                .addParameter("cursos", diplomado.getCursos())
                .addParameter("imagen", diplomado.getImagen())
                .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Diplomado> getAllDiplomadosFull() {
        try(Connection conn = sql2o.open()){
            List<Diplomado> salida= conn.createQuery("select * from diplomado ORDER BY id").executeAndFetch(Diplomado.class);
            for (int i = 1; i < salida.size(); i++) {
                String getCoordinadores  = 
                "select docente.nombre,docente.id " + 
                "from docente, diplomado_docente " + 
                "WHERE diplomado_docente.id_diplomado = +" + i+  " and diplomado_docente.id_docente = docente.id";
                try (Connection con = sql2o.open()) {   
                    List<Docente> docentes= null;
                    docentes = con.createQuery(getCoordinadores).executeAndFetch(Docente.class);
                    Diplomado valor = salida.get(i);
                    valor.setDocentes(docentes);
                    salida.set(i,valor);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    return salida;
                }
            }
            return salida;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


}
