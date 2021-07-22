package com.G3Tingeso.PrivateServices.services;
import com.G3Tingeso.PrivateServices.repositories.Rol_Repository;
import com.G3Tingeso.PrivateServices.models.Rol;

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
 * RolService
 */

@CrossOrigin
@RestController
public class RolService {

    private final Rol_Repository RolRepository;
    RolService(Rol_Repository RolRepository){
        this.RolRepository = RolRepository;
    }

    @GetMapping("/roles")
    public List<Rol> getAllRol(){
        return RolRepository.getAllRols();
    }

    @GetMapping("/roles/{id}")
    public Rol getRol(@PathVariable int id){
        return RolRepository.getRol(id);
    }

    @GetMapping("/roles/count")
    public String countRol(){
        int total = RolRepository.countRol();
        return String.format("Tienes en total, %s de la lista.", total);
    }

    @PostMapping("/roles/create")
    @ResponseBody
    public Boolean createRol(@RequestBody Rol Rol){
        boolean result = RolRepository.createRol(Rol);
        return result;
    }

    @DeleteMapping("/roles/delete/{id}")
    public boolean deleteRol(@PathVariable int id){
        return RolRepository.deleteRol(id);
    }

    @PutMapping("/roles/update")
    public boolean updateRol(@RequestBody Rol Rol){
         return RolRepository.updateRol(Rol);
    }

}