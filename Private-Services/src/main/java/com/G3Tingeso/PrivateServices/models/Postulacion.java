package com.G3Tingeso.PrivateServices.models;

/**
 * Postulacion
 */
public class Postulacion {
    private int id;
    private String comentario;
    private String src_doc;
    private int id_postulante;
    private int id_diplomado;

    public int getId() {
    	return this.id;
    }
    public void setId(int id) {
    	this.id = id;
    }


    public String getComentario() {
    	return this.comentario;
    }
    public void setComentario(String comentario) {
    	this.comentario = comentario;
    }


    public String getSrc_doc() {
    	return this.src_doc;
    }
    public void setSrc_doc(String src_doc) {
    	this.src_doc = src_doc;
    }


    public int getId_postulante() {
    	return this.id_postulante;
    }
    public void setId_postulante(int id_postulante) {
    	this.id_postulante = id_postulante;
    }


    public int getId_diplomado() {
    	return this.id_diplomado;
    }
    public void setId_diplomado(int id_diplomado) {
    	this.id_diplomado = id_diplomado;
    }

    
}