package com.G3Tingeso.PrivateServices.models;

/**
 * Titulo
 */
public class Titulo {
    private int id;
    private String nombre;
    private String descripcion;
    private int id_docente;

    public int getId() {
    	return this.id;
    }
    public void setId(int id) {
    	this.id = id;
    }


    public String getNombre() {
    	return this.nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
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