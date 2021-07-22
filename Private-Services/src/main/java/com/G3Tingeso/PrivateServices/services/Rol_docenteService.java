package com.G3Tingeso.PrivateServices.services;
import com.G3Tingeso.PrivateServices.repositories.Rol_docente_Repository;
import com.G3Tingeso.PrivateServices.models.Rol_docente;

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
 * Rol_docenteService
 */

@CrossOrigin
@RestController
public class Rol_docenteService {

    private final Rol_docente_Repository Rol_docenteRepository;
    Rol_docenteService(Rol_docente_Repository Rol_docenteRepository){
        this.Rol_docenteRepository = Rol_docenteRepository;
    }

    @GetMapping("/rol_docentes")
    public List<Rol_docente> getAllRol_docente(){
        return Rol_docenteRepository.getAllRol_docentes();
    }

    @GetMapping("/rol_docentes/{id}")
    public Rol_docente getRol_docente(@PathVariable int id){
        return Rol_docenteRepository.getRol_docente(id);
    }

    @GetMapping("/rol_docentes/count")
    public String countRol_docente(){
        int total = Rol_docenteRepository.countRol_docente();
        return String.format("Tienes en total, %s de la lista.", total);
    }

    @PostMapping("/rol_docentes/create")
    @ResponseBody
    public Boolean createRol_docente(@RequestBody Rol_docente Rol_docente){
        boolean result = Rol_docenteRepository.createRol_docente(Rol_docente);
        return result;
    }

    @DeleteMapping("/rol_docentes/delete/{id}")
    public boolean deleteRol_docente(@PathVariable int id){
        return Rol_docenteRepository.deleteRol_docente(id);
    }

    @PutMapping("/rol_docentes/update")
    public boolean updateRol_docente(@RequestBody Rol_docente Rol_docente){
         return Rol_docenteRepository.updateRol_docente(Rol_docente);
    }
   
}