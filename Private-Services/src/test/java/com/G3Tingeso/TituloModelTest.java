package com.G3Tingeso;
import com.G3Tingeso.PrivateServices.repositories.TituloRepository;
import com.G3Tingeso.PrivateServices.repositories.Titulo_RepositoryImp;
import com.G3Tingeso.PrivateServices.models.Titulo;
import com.G3Tingeso.PrivateServices.services.TituloService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class TituloModelTest{
    
    int id = 1;
    String nombre = "nombre";

    Titulo titulo = new Titulo();

    @Test
    public void testId(){
        titulo.setId(1);
        Assertions.assertEquals(id, titulo.getId(), "Listo");
    }
    @Test
    public void testNombre(){
        titulo.setNombre("nombre");
        Assertions.assertEquals(nombre, titulo.getNombre(), "Listo");
    }
}