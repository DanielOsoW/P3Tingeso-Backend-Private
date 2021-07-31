package com.G3Tingeso.PrivateServices.models;

/**
 * Docente
 */
public class Docente {
    private int id;
    private String nombre;
    private int id_rol_docente;
    private Titulo[] titulos;

    public int getId() {
    	return this.id;
    }
    public Titulo[] getTitulos() {
        return titulos;
    }
    public void setTitulos(Titulo[] titulos) {
        this.titulos = titulos;
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


    public int getId_rol_docente() {
    	return this.id_rol_docente;
    }
    public void setId_rol_docente(int id_rol_docente) {
    	this.id_rol_docente = id_rol_docente;
    }

    
}