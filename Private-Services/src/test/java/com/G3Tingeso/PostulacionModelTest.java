package com.G3Tingeso;
import com.G3Tingeso.PrivateServices.models.Postulacion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostulacionModelTest{

    int id = 1;
    String comentario = "comentario";
    String src_doc = "src_doc";
    int id_postulante = 2;
    int id_diplomado = 3;

    Postulacion postulacion = new Postulacion();

    @Test
    public void testId(){
        postulacion.setId(1);
        Assertions.assertEquals(id, postulacion.getId(), "Listo");
    }
    @Test
    public void testComentario(){
        postulacion.setComentario("comentario");
        Assertions.assertEquals(comentario, postulacion.getComentario(), "Listo");
    }
    @Test
    public void testSrc_doc(){
        postulacion.setSrc_doc("src_doc");
        Assertions.assertEquals(src_doc, postulacion.getSrc_doc(), "Listo");
    }
    @Test
    public void testId_postulante(){
        postulacion.setId_postulante(2);
        Assertions.assertEquals(id_postulante, postulacion.getId_postulante(), "Listo");
    }
    @Test
    public void testId_diplomado(){
        postulacion.setId_diplomado(3);
        Assertions.assertEquals(id_diplomado, postulacion.getId_diplomado(), "Listo");
    }
}