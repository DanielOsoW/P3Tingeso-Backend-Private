package com.G3Tingeso.PrivateServices.services;
import com.G3Tingeso.PrivateServices.repositories.Postulacion_Repository;
import com.G3Tingeso.PrivateServices.models.Postulacion;

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
 * PostulacionService
 */

@CrossOrigin
@RestController
public class PostulacionService {

    private final Postulacion_Repository PostulacionRepository;
    PostulacionService(Postulacion_Repository PostulacionRepository){
        this.PostulacionRepository = PostulacionRepository;
    }

    @GetMapping("/postulaciones")
    public List<Postulacion> getAllPostulacion(){
        return PostulacionRepository.getAllPostulacions();
    }

    @GetMapping("/postulaciones/{id}")
    public Postulacion getPostulacion(@PathVariable int id){
        return PostulacionRepository.getPostulacion(id);
    }

    @GetMapping("/postulaciones/count")
    public String countPostulacion(){
        int total = PostulacionRepository.countPostulacion();
        return String.format("Tienes en total, %s de la lista.", total);
    }

    @PostMapping("/postulaciones/create")
    @ResponseBody
    public Boolean createPostulacion(@RequestBody Postulacion Postulacion){
        boolean result = PostulacionRepository.createPostulacion(Postulacion);
        return result;
    }

    @DeleteMapping("/postulaciones/delete/{id}")
    public boolean deletePostulacion(@PathVariable int id){
        return PostulacionRepository.deletePostulacion(id);
    }

    @PutMapping("/postulaciones/update")
    public boolean updatePostulacion(@RequestBody Postulacion Postulacion){
         return PostulacionRepository.updatePostulacion(Postulacion);
    }

}