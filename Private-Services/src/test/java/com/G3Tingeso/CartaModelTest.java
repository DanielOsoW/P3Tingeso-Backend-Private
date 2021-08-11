package com.G3Tingeso;
import com.G3Tingeso.PrivateServices.models.Carta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CartaModelTest{
    int id = 1;
    String descripcion = "Carta";
    int id_docente = 2;
    int id_postulante = 3;

    Carta carta = new Carta();

    @Test
    public void testId(){
        carta.setId(1);
        Assertions.assertEquals(id, carta.getId(), "Listo");
    }
    @Test
    public void testDescription(){
        carta.setDescripcion("Carta");
        Assertions.assertEquals(descripcion, carta.getDescripcion(), "Listo");
    }
    @Test
    public void testIdDocente(){
        carta.setId_docente(2);
        Assertions.assertEquals(id_docente, carta.getId_docente(), "Listo");
    }
    @Test
    public void testId_postulante(){
        carta.setId_postulante(3);
        Assertions.assertEquals(id_postulante, carta.getId_postulante(), "Listo");
    }
}