package com.G3Tingeso.PrivateServices.services;
import com.G3Tingeso.PrivateServices.repositories.Titulo_Repository;
import com.G3Tingeso.PrivateServices.models.Titulo;

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
 * TituloService
 */

@CrossOrigin
@RestController
public class TituloService {

    private final Titulo_Repository TituloRepository;
    TituloService(Titulo_Repository TituloRepository){
        this.TituloRepository = TituloRepository;
    }

    @GetMapping("/titulos")
    public List<Titulo> getAllTitulo(){
        return TituloRepository.getAllTitulos();
    }

    @GetMapping("/titulos/{id}")
    public Titulo getTitulo(@PathVariable int id){
        return TituloRepository.getTitulo(id);
    }

    @GetMapping("/titulos/count")
    public String countTitulo(){
        int total = TituloRepository.countTitulo();
        return String.format("Tienes en total, %s de la lista.", total);
    }

    @PostMapping("/titulos/create")
    @ResponseBody
    public Boolean createTitulo(@RequestBody Titulo Titulo){
        boolean result = TituloRepository.createTitulo(Titulo);
        return result;
    }

    @DeleteMapping("/titulos/delete/{id}")
    public boolean deleteTitulo(@PathVariable int id){
        return TituloRepository.deleteTitulo(id);
    }

    @PutMapping("/titulos/update")
    public boolean updateTitulo(@RequestBody Titulo Titulo){
         return TituloRepository.updateTitulo(Titulo);
    }
    
    @GetMapping("/titulos/docente/{id}")
    public List<Titulo> getTitulosDocente(@PathVariable int id){
        return TituloRepository.getTitulosDocente(id);
    }
}