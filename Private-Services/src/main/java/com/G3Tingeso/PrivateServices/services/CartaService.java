package com.G3Tingeso.PrivateServices.services;
import com.G3Tingeso.PrivateServices.repositories.Carta_Repository;
import com.G3Tingeso.PrivateServices.models.Carta;

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
 * CartaService
 */

@CrossOrigin
@RestController
public class CartaService {

    private final Carta_Repository CartaRepository;
    CartaService(Carta_Repository CartaRepository){
        this.CartaRepository = CartaRepository;
    }

    @GetMapping("/cartas")
    public List<Carta> getAllCarta(){
        return CartaRepository.getAllCartas();
    }

    @GetMapping("/cartas/{id}")
    public Carta getCarta(@PathVariable int id){
        return CartaRepository.getCarta(id);
    }

    @GetMapping("/cartas/count")
    public String countCarta(){
        int total = CartaRepository.countCarta();
        return String.format("Tienes en total, %s de la lista.", total);
    }

    @PostMapping("/cartas/create")
    @ResponseBody
    public Boolean createCarta(@RequestBody Carta Carta){
        boolean result = CartaRepository.createCarta(Carta);
        return result;
    }

    @DeleteMapping("/cartas/delete/{id}")
    public boolean deleteCarta(@PathVariable int id){
        return CartaRepository.deleteCarta(id);
    }

    @PutMapping("/cartas/update")
    public boolean updateCarta(@RequestBody Carta Carta){
         return CartaRepository.updateCarta(Carta);
    }

}