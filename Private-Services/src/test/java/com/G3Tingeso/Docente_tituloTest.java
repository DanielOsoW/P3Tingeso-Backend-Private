package com.G3Tingeso;
import com.G3Tingeso.PrivateServices.models.Docente_titulo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Docente_tituloTest{
    int id = 1;
    int id_docente = 2;
    int id_titulo = 3;

    Docente_titulo docente_titulo = new Docente_titulo();

    @Test
    public void idTest(){
        docente_titulo.setId(1);
        Assertions.assertEquals(id, docente_titulo.getId(), "Listo");
    }
    @Test
    public void id_docenteTest(){
        docente_titulo.setId_docente(2);
        Assertions.assertEquals(id_docente, docente_titulo.getId_docente(), "Listo");
    } 
    @Test
    public void id_tituloTest(){
        docente_titulo.setId_titulo(3);
        Assertions.assertEquals(id_titulo, docente_titulo.getId_titulo(), "Listo");
    }
}