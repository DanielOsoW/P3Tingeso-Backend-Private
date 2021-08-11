package com.G3Tingeso;
import com.G3Tingeso.PrivateServices.models.Postulante;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostulanteModelTest{
    
    int id = 1;
    String nombre = "nombre";
    String correo = "correo";
    String num_telefono = "num_telefono";

    Postulante postulante = new Postulante();

    @Test
    public void testId(){
        postulante.setId(1);
        Assertions.assertEquals(id, postulante.getId(), "Listo");
    }
    @Test
    public void testNombre(){
        postulante.setNombre("nombre");
        Assertions.assertEquals(nombre, postulante.getNombre(), "Listo");
    }
    @Test
    public void testCorreo(){
        postulante.setCorreo("correo");
        Assertions.assertEquals(correo, postulante.getCorreo(), "Listo");
    }
    @Test
    public void testNum_telefono(){
        postulante.setNum_telefono("num_telefono");
        Assertions.assertEquals(num_telefono, postulante.getNum_telefono(), "Listo");
    }
    
}