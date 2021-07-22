package com.G3Tingeso.PrivateServices.services;
import com.G3Tingeso.PrivateServices.repositories.Docente_Repository;
import com.G3Tingeso.PrivateServices.models.Docente;

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
 * DocenteService
 */

@CrossOrigin
@RestController
public class DocenteService {

    private final Docente_Repository DocenteRepository;
    DocenteService(Docente_Repository DocenteRepository){
        this.DocenteRepository = DocenteRepository;
    }

    @GetMapping("/docentes")
    public List<Docente> getAllDocente(){
        return DocenteRepository.getAllDocentes();
    }

    @GetMapping("/docentes/{id}")
    public Docente getDocente(@PathVariable int id){
        return DocenteRepository.getDocente(id);
    }

    @GetMapping("/docentes/count")
    public String countDocente(){
        int total = DocenteRepository.countDocente();
        return String.format("Tienes en total, %s de la lista.", total);
    }

    @PostMapping("/docentes/create")
    @ResponseBody
    public Boolean createDocente(@RequestBody Docente Docente){
        boolean result = DocenteRepository.createDocente(Docente);
        return result;
    }

    @DeleteMapping("/docentes/delete/{id}")
    public boolean deleteDocente(@PathVariable int id){
        return DocenteRepository.deleteDocente(id);
    }

    @PutMapping("/docentes/update")
    public boolean updateDocente(@RequestBody Docente Docente){
         return DocenteRepository.updateDocente(Docente);
    }

}