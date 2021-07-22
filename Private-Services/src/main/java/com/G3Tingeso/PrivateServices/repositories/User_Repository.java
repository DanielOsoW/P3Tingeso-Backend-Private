package com.G3Tingeso.PrivateServices.repositories;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.User;

/**
 * User_Repository
 */
public interface User_Repository {

    public int countUser();
    public List<User> getAllUsers();
    public boolean createUser(User user);
    public boolean deleteUser(int id);
    public boolean updateUser(User user);
    public User getUser(int id);

}