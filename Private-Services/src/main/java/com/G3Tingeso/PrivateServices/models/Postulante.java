package com.G3Tingeso.PrivateServices.models;

public class Postulante {
    private int id;
    private String nombre;
    private String correo;
    private String num_telefono;

    
    public int getId() {return id;}
    public String getNum_telefono() {return num_telefono;}
    public void setNum_telefono(String num_telefono) {this.num_telefono = num_telefono;}
    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setId(int id) {this.id = id;}    
}
