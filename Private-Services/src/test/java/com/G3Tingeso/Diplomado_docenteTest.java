package com.G3Tingeso;
import com.G3Tingeso.PrivateServices.models.Diplomado_docente;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Diplomado_docenteTest{
    int id = 1;
    int id_docente = 2;
    int id_diplomado = 3;
    boolean coordinador = true;

    Diplomado_docente diplomado_docente = new Diplomado_docente();

    @Test
    public void coordinadorTest(){
        diplomado_docente.setCoordinador(true);
        Assertions.assertEquals(coordinador, diplomado_docente.isCoordinador(), "Listo");
    }
    @Test
    public void idTest(){
        diplomado_docente.setId(1);
        Assertions.assertEquals(id, diplomado_docente.getId(), "Listo");
    }
    @Test
    public void testIdDocente(){
        diplomado_docente.setId_docente(2);
        Assertions.assertEquals(id_docente, diplomado_docente.getId_docente(), "Listo");
    }
    @Test
    public void testId_postulante(){
        diplomado_docente.setId_diplomado(3);
        Assertions.assertEquals(id_diplomado, diplomado_docente.getId_diplomado(), "Listo");
    }
}