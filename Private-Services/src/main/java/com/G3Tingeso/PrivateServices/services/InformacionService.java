package com.G3Tingeso.PrivateServices.services;
import com.G3Tingeso.PrivateServices.repositories.Informacion_Repository;
import com.G3Tingeso.PrivateServices.models.Informacion;

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
 * InformacionService
 */

@CrossOrigin
@RestController
public class InformacionService {

    private final Informacion_Repository InformacionRepository;
    InformacionService(Informacion_Repository InformacionRepository){
        this.InformacionRepository = InformacionRepository;
    }

    @GetMapping("/informaciones")
    public List<Informacion> getAllInformacion(){
        return InformacionRepository.getAllInformacions();
    }

    @GetMapping("/informaciones/{id}")
    public Informacion getInformacion(@PathVariable int id){
        return InformacionRepository.getInformacion(id);
    }

    @GetMapping("/informaciones/count")
    public String countInformacion(){
        int total = InformacionRepository.countInformacion();
        return String.format("Tienes en total, %s de la lista.", total);
    }

    @PostMapping("/informaciones/create")
    @ResponseBody
    public Boolean createInformacion(@RequestBody Informacion Informacion){
        boolean result = InformacionRepository.createInformacion(Informacion);
        return result;
    }

    @DeleteMapping("/informaciones/delete/{id}")
    public boolean deleteInformacion(@PathVariable int id){
        return InformacionRepository.deleteInformacion(id);
    }

    @PutMapping("/informaciones/update")
    public boolean updateInformacion(@RequestBody Informacion Informacion){
         return InformacionRepository.updateInformacion(Informacion);
    }



}