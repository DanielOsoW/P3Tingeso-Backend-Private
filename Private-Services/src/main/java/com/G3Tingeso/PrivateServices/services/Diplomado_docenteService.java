package com.G3Tingeso.PrivateServices.services;
import com.G3Tingeso.PrivateServices.repositories.Diplomado_docente_Repository;
import com.G3Tingeso.PrivateServices.models.Diplomado_docente;

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
 * Diplomado_docenteService
 */

@CrossOrigin
@RestController
public class Diplomado_docenteService {
   
    private final Diplomado_docente_Repository Diplomado_docenteRepository;
    Diplomado_docenteService(Diplomado_docente_Repository Diplomado_docenteRepository){
        this.Diplomado_docenteRepository = Diplomado_docenteRepository;
    }

    @GetMapping("/diplomado_docentes")
    public List<Diplomado_docente> getAllDiplomado_docente(){
        return Diplomado_docenteRepository.getAllDiplomado_docentes();
    }

    @GetMapping("/diplomado_docentes/{id}")
    public Diplomado_docente getDiplomado_docente(@PathVariable int id){
        return Diplomado_docenteRepository.getDiplomado_docente(id);
    }

    @GetMapping("/diplomado_docentes/count")
    public String countDiplomado_docente(){
        int total = Diplomado_docenteRepository.countDiplomado_docente();
        return String.format("Tienes en total, %s de la lista.", total);
    }

    @PostMapping("/diplomado_docentes/create")
    @ResponseBody
    public Boolean createDiplomado_docente(@RequestBody Diplomado_docente Diplomado_docente){
        boolean result = Diplomado_docenteRepository.createDiplomado_docente(Diplomado_docente);
        return result;
    }

    @DeleteMapping("/diplomado_docentes/delete/{id}")
    public boolean deleteDiplomado_docente(@PathVariable int id){
        return Diplomado_docenteRepository.deleteDiplomado_docente(id);
    }

    @PutMapping("/diplomado_docentes/update")
    public boolean updateDiplomado_docente(@RequestBody Diplomado_docente Diplomado_docente){
         return Diplomado_docenteRepository.updateDiplomado_docente(Diplomado_docente);
    }
 
}
