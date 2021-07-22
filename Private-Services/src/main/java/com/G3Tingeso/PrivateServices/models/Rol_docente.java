package com.G3Tingeso.PrivateServices.models;

/**
 * Rol_docente
 */
public class Rol_docente {
    private int id;
    private String descripcion;
    private int id_docente;

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

    
}