package com.G3Tingeso.PrivateServices.services;
import com.G3Tingeso.PrivateServices.repositories.Docente_titulo_Repository;
import com.G3Tingeso.PrivateServices.models.Docente_titulo;

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
 * Docente_tituloService
 */

@CrossOrigin
@RestController
public class Docente_tituloService {
  
    private final Docente_titulo_Repository Docente_tituloRepository;
    Docente_tituloService(Docente_titulo_Repository Docente_tituloRepository){
        this.Docente_tituloRepository = Docente_tituloRepository;
    }

    @GetMapping("/docente_titulos")
    public List<Docente_titulo> getAllDocente_titulo(){
        return Docente_tituloRepository.getAllDocente_titulos();
    }

    @GetMapping("/docente_titulos/{id}")
    public Docente_titulo getDocente_titulo(@PathVariable int id){
        return Docente_tituloRepository.getDocente_titulo(id);
    }

    @GetMapping("/docente_titulos/count")
    public String countDocente_titulo(){
        int total = Docente_tituloRepository.countDocente_titulo();
        return String.format("Tienes en total, %s de la lista.", total);
    }

    @PostMapping("/docente_titulos/create")
    @ResponseBody
    public Boolean createDocente_titulo(@RequestBody Docente_titulo Docente_titulo){
        boolean result = Docente_tituloRepository.createDocente_titulo(Docente_titulo);
        return result;
    }

    @DeleteMapping("/docente_titulos/delete/{id}")
    public boolean deleteDocente_titulo(@PathVariable int id){
        return Docente_tituloRepository.deleteDocente_titulo(id);
    }

    @PutMapping("/docente_titulos/update")
    public boolean updateDocente_titulo(@RequestBody Docente_titulo Docente_titulo){
         return Docente_tituloRepository.updateDocente_titulo(Docente_titulo);
    }
  
}
