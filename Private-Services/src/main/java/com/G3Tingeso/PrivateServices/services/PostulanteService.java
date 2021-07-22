package com.G3Tingeso.PrivateServices.services;
import com.G3Tingeso.PrivateServices.repositories.Postulante_Repository;
import com.G3Tingeso.PrivateServices.models.Postulante;

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
 * PostulanteService
 */


@CrossOrigin
@RestController
public class PostulanteService {
    
    private final Postulante_Repository PostulanteRepository;
    PostulanteService(Postulante_Repository PostulanteRepository){
        this.PostulanteRepository = PostulanteRepository;
    }

    @GetMapping("/postulantes")
    public List<Postulante> getAllPostulante(){
        return PostulanteRepository.getAllPostulantes();
    }

    @GetMapping("/postulantes/{id}")
    public Postulante getPostulante(@PathVariable int id){
        return PostulanteRepository.getPostulante(id);
    }

    @GetMapping("/postulantes/count")
    public String countPostulante(){
        int total = PostulanteRepository.countPostulante();
        return String.format("Tienes en total, %s de la lista.", total);
    }

    @PostMapping("/postulantes/create")
    @ResponseBody
    public Boolean createPostulante(@RequestBody Postulante Postulante){
        boolean result = PostulanteRepository.createPostulante(Postulante);
        return result;
    }

    @DeleteMapping("/postulantes/delete/{id}")
    public boolean deletePostulante(@PathVariable int id){
        return PostulanteRepository.deletePostulante(id);
    }

    @PutMapping("/postulantes/update")
    public boolean updatePostulante(@RequestBody Postulante Postulante){
         return PostulanteRepository.updatePostulante(Postulante);
    }


    
}