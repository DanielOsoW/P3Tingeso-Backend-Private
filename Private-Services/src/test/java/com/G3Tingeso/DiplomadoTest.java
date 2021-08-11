package com.G3Tingeso;
import com.G3Tingeso.PrivateServices.models.Diplomado;
//import com.G3Tingeso.PrivateServices.models.Docente;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiplomadoTest{
    int id = 1;
    String titulo = "Ciencia de Datos";
    String introduccion = "Es la ciencia que estudia los datos";
    String objetivo = "Poder estudiar los datos";
    String descripcion = "Se lleva a cabo el estudio de los datos";
    int horas = 42;
    int cursos = 6;
    String imagen = "img";
    int arancel = 2400000;
    //Docente[] docentes = new Docente[2];
    //Docente coordinador = new Docente();

    Diplomado diplomado = new Diplomado();

    @Test
    public void idTest(){
        diplomado.setId(1);
        Assertions.assertEquals(id, diplomado.getId(), "Listo");
    }
    @Test
    public void tituloTest(){
        diplomado.setTitulo("Ciencia de Datos");
        Assertions.assertEquals(titulo, diplomado.getTitulo(), "Listo");
    } 
    @Test
    public void introduccionTest(){
        diplomado.setIntroduccion("Es la ciencia que estudia los datos");
        Assertions.assertEquals(introduccion, diplomado.getIntroduccion(), "Listo");
    }
    @Test
    public void objetivoTest(){
        diplomado.setObjetivo("Poder estudiar los datos");
        Assertions.assertEquals(objetivo, diplomado.getObjetivo(), "Listo");
    }
    @Test
    public void descripcionTest(){
        diplomado.setDescripcion("Se lleva a cabo el estudio de los datos");
        Assertions.assertEquals(descripcion, diplomado.getDescripcion(), "Listo");
    }
    @Test
    public void horasTest(){
        diplomado.setHoras(42);
        Assertions.assertEquals(horas, diplomado.getHoras(), "Listo");
    }
    @Test
    public void cursosTest(){
        diplomado.setCursos(6);
        Assertions.assertEquals(cursos, diplomado.getCursos(), "Listo");
    }
    @Test
    public void imagenTest(){
        diplomado.setImagen("img");
        Assertions.assertEquals(imagen, diplomado.getImagen(), "Listo");
    }
    @Test
    public void arancelTest(){
        diplomado.setArancel(2400000);
        Assertions.assertEquals(arancel, diplomado.getArancel(), "Listo");
    }
    /*
    @Test
    public void docentesTest(){
        diplomado.setDocentes(new Docente[2]);
        Assertions.assertEquals(coordinador, diplomado.getCoordinador(), "Listo");
    }
    
    @Test
    public void coordinadorTest(){
        diplomado.setCoordinador(new Docente());
        Assertions.assertEquals(coordinador, diplomado.getCoordinador(), "Listo");
    } */
}