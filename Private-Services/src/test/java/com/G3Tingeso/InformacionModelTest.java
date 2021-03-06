package com.G3Tingeso;
import com.G3Tingeso.PrivateServices.models.Informacion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InformacionModelTest{
    
    int id = 1;
    String nombre = "nombre";
    String contenido = "contenido";
    int id_diplomado = 2;

    Informacion informacion = new Informacion();

    @Test
    public void testId(){
        informacion.setId(1);
        Assertions.assertEquals(id, informacion.getId(), "Listo");
    }
    @Test
    public void testNombre(){
        informacion.setNombre("nombre");
        Assertions.assertEquals(nombre, informacion.getNombre(), "Listo");
    }
    @Test
    public void testContenido(){
        informacion.setContenido("contenido");
        Assertions.assertEquals(contenido, informacion.getContenido(), "Listo");
    }
    @Test
    public void testId_diplomado(){
        informacion.setId_diplomado(2);
        Assertions.assertEquals(id_diplomado, informacion.getId_diplomado(), "Listo");
    }
    
}