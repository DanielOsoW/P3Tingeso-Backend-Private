package com.G3Tingeso.PrivateServices.models;

public class Informacion {
    private int id;
    private String nombre;
    private String contenido;
    private int id_diplomado;

    //Setters and getters
    public int getId() {return id;}
    public int getId_diplomado() {return id_diplomado;}
    public void setId_diplomado(int id_diplomado) {this.id_diplomado = id_diplomado;}
    public String getContenido() {return contenido;}
    public void setContenido(String contenido) {this.contenido = contenido;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setId(int id) {this.id = id;}    
}
