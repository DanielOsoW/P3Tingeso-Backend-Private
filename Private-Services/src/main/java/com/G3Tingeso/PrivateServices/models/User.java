package com.G3Tingeso.PrivateServices.models;

/**
 * User
 */
public class User {
    private int id;
    private String email;
    private String password;
    private int id_docente;
    private int id_rol;

    public int getId() {
    	return this.id;
    }
    public void setId(int id) {
    	this.id = id;
    }


    public String getEmail() {
    	return this.email;
    }
    public void setEmail(String email) {
    	this.email = email;
    }


    public String getPassword() {
    	return this.password;
    }
    public void setPassword(String password) {
    	this.password = password;
    }


    public int getId_docente() {
    	return this.id_docente;
    }
    public void setId_docente(int id_docente) {
    	this.id_docente = id_docente;
    }


    public int getId_rol() {
    	return this.id_rol;
    }
    public void setId_rol(int id_rol) {
    	this.id_rol = id_rol;
    }

    
}