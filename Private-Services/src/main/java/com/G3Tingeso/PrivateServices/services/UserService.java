package com.G3Tingeso.PrivateServices.services;
import com.G3Tingeso.PrivateServices.repositories.User_Repository;
import com.G3Tingeso.PrivateServices.models.User;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * UserService
 */


@CrossOrigin
@RestController
public class UserService {

    private final User_Repository UserRepository;
    UserService(User_Repository UserRepository){
        this.UserRepository = UserRepository;
    }

    @GetMapping("/users")
    public List<User> getAllUser(){
        return UserRepository.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        return UserRepository.getUser(id);
    }

    @GetMapping("/users/count")
    public String countUser(){
        int total = UserRepository.countUser();
        return String.format("Tienes en total, %s de la lista.", total);
    }

    @PostMapping("/users/create")
    @ResponseBody
    public Boolean createUser(@RequestBody User User){
        boolean result = UserRepository.createUser(User);
        return result;
    }

    @DeleteMapping("/users/delete/{id}")
    public boolean deleteUser(@PathVariable int id){
        return UserRepository.deleteUser(id);
    }

    @PutMapping("/users/update")
    public boolean updateUser(@RequestBody User User){
         return UserRepository.updateUser(User);
    }
   
}