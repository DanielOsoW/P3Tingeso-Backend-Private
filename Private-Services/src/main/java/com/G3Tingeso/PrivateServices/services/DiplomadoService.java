package com.G3Tingeso.PrivateServices.services;

import com.G3Tingeso.PrivateServices.repositories.Diplomado_Repository;
import com.G3Tingeso.PrivateServices.models.Diplomado;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * DiplomadoService
 */
import java.util.List;

@CrossOrigin
@RestController
public class DiplomadoService {
    
    private final Diplomado_Repository DiplomadoRepository;
    DiplomadoService(Diplomado_Repository DiplomadoRepository){
        this.DiplomadoRepository = DiplomadoRepository;
    }

    @GetMapping("/diplomados")
    public List<Diplomado> getAllDiplomado(){
        return DiplomadoRepository.getAllDiplomados();
    }
    
    @GetMapping("/diplomados/{id}")
    public Diplomado getDiplomado(@PathVariable int id){
        return DiplomadoRepository.getDiplomado(id);
    }

    @GetMapping("/diplomados/count")
    public String countDiplomado(){
        int total = DiplomadoRepository.countDiplomado();
        return String.format("Tienes en total, %s de la lista.", total);
    }

    @PostMapping("/diplomados/create")
    @ResponseBody
    public Boolean createDiplomado(@RequestBody Diplomado Diplomado){
        boolean result = DiplomadoRepository.createDiplomado(Diplomado);
        return result;
    }

    @GetMapping("/diplomados/delete/{id}")
    public boolean deleteDiplomado(@PathVariable int id){
        return DiplomadoRepository.deleteDiplomado(id);
    }
    @PostMapping("/diplomados/update")
    public boolean updateDiplomado(@RequestBody Diplomado Diplomado){
         return DiplomadoRepository.updateDiplomado(Diplomado);
    }


    
}