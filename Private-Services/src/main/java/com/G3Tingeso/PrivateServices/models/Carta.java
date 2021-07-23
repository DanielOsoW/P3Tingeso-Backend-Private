package com.G3Tingeso.PrivateServices.models;

/**
 * Carta
 */
public class Carta {
    private int id;
    private String descripcion;
    private int id_docente;
    private int id_postulante;


    public int getId() {
    	return this.id;
    }
    public void setId(int id) {
    	this.id = id;
    }


    public String getDescripcion() {
    	return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
    	this.descripcion = descripcion;
    }


    public int getId_docente() {
    	return this.id_docente;
    }
    public void setId_docente(int id_docente) {
    	this.id_docente = id_docente;
    }


    public int getId_postulante() {
    	return this.id_postulante;
    }
    public void setId_postulante(int id_postulante) {
    	this.id_postulante = id_postulante;
    }




}