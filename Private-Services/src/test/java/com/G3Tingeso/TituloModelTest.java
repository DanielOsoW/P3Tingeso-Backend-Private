package com.G3Tingeso;
import com.G3Tingeso.PrivateServices.models.Titulo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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