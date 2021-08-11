package com.G3Tingeso;
import com.G3Tingeso.PrivateServices.models.Docente;
//import com.G3Tingeso.PrivateServices.models.Titulo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DocenteTest{
    int id = 1;
    String nombre = "Ing. Informático";
    int id_rol_docente = 2;
    //Titulo[] titulos = new Titulo[2];

    Docente docente = new Docente();

    @Test
    public void idTest(){
        docente.setId(1);
        Assertions.assertEquals(id, docente.getId(), "Listo");
    }
    @Test
    public void nombreTest(){
        docente.setNombre("Ing. Informático");
        Assertions.assertEquals(nombre, docente.getNombre(), "Listo");
    } 
    @Test
    public void id_rol_docenteTest(){
        docente.setId_rol_docente(2);
        Assertions.assertEquals(id_rol_docente, docente.getId_rol_docente(), "Listo");
    }
    /*
    @Test
    public void titulosTest(){
        docente.setTitulos(new Titulo[2]);
        Assertions.assertEquals(titulos, docente.getTitulos(), "Listo");
    }*/
}