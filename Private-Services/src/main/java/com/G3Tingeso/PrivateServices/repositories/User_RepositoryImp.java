package com.G3Tingeso.PrivateServices.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.User;

/**
 * User_RepositoryImp
 */
@Repository
public class User_RepositoryImp implements User_Repository{
    
    @Autowired
    private Sql2o sql2o;

    @Override
    public int countUser() {
        int total = 0;
        try(Connection conn = sql2o.open()){
            total = conn.createQuery("SELECT COUNT(*) FROM user").executeScalar(Integer.class);
        }
        return total;
    }

    @Override
    public List<User> getAllUsers() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from user ORDER BY id")
                    .executeAndFetch(User.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public User getUser(int id) {
        String sql = "SELECT * FROM user where id=:id";

		try (Connection con = sql2o.open()) {
			return con.createQuery(sql)
				.addParameter("id", id)
				.executeAndFetchFirst(User.class);
		}catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean createUser(User user) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("insert into user (email,password,id_docente,id_rol)"+
            " values (:email,:password,:id_docente, :id_rol)", true)     
                    .addParameter("email", user.getEmail())
                    .addParameter("password", user.getPassword())
                    .addParameter("id_docente", user.getId_docente())
                    .addParameter("id_rol", user.getId_rol())
                    .executeUpdate().getKey();
            return true;      
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteUser(int id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM user WHERE id = :id").addParameter("id", id)
            .executeUpdate();
            return true; 
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateUser(User user) {
        String updateSql = "UPDATE user SET "+
        "email = :email, "+
        "password = :password, "+
        "id_docente = :id_docente, "+
        "id_rol = :id_rol "+
        "WHERE id = :id";
        try (Connection con = sql2o.open()) {   
            con.createQuery(updateSql)
                .addParameter("id", user.getId())
                .addParameter("email", user.getEmail())
                .addParameter("password", user.getPassword())
                .addParameter("id_docente", user.getId_docente())
                .addParameter("id_rol", user.getId_rol())
                .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    
}