package com.G3Tingeso.PrivateServices.services;
import com.G3Tingeso.PrivateServices.repositories.Usuario_Repository;
import com.G3Tingeso.PrivateServices.models.Usuario;

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
 * UsuarioService
 */


@CrossOrigin
@RestController
public class UsuarioService {

    private final Usuario_Repository UsuarioRepository;
    UsuarioService(Usuario_Repository UsuarioRepository){
        this.UsuarioRepository = UsuarioRepository;
    }

    @GetMapping("/usuarios")
    public List<Usuario> getAllUsuario(){
        return UsuarioRepository.getAllUsuarios();
    }

    @GetMapping("/usuarios/{id}")
    public Usuario getUsuario(@PathVariable int id){
        return UsuarioRepository.getUsuario(id);
    }

    @GetMapping("/usuarios/count")
    public String countUsuario(){
        int total = UsuarioRepository.countUsuario();
        return String.format("Tienes en total, %s de la lista.", total);
    }

    @PostMapping("/usuarios/create")
    @ResponseBody
    public Boolean createUsuario(@RequestBody Usuario Usuario){
        boolean result = UsuarioRepository.createUsuario(Usuario);
        return result;
    }

    @DeleteMapping("/usuarios/delete/{id}")
    public boolean deleteUsuario(@PathVariable int id){
        return UsuarioRepository.deleteUsuario(id);
    }

    @PutMapping("/usuarios/update")
    public boolean updateUsuario(@RequestBody Usuario Usuario){
         return UsuarioRepository.updateUsuario(Usuario);
    }
   
}