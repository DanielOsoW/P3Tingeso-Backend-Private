package com.G3Tingeso.PrivateServices.models;

public class Diplomado {
    private int id;
    private String titulo;
    private String introduccion;
    private String objetivo;
    private String descripcion;
    private int horas;
    private int cursos;
    private String imagen;

    public int getId() {return id;}
    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public String getImagen() {return imagen;}
    public void setImagen(String imagen) {this.imagen = imagen;}
    public int getCursos() {return cursos;}
    public void setCursos(int cursos) {this.cursos = cursos;}
    public int getHoras() {return horas;}
    public void setHoras(int horas) {this.horas = horas;}
    public String getObjetivo() {return objetivo;}
    public void setObjetivo(String objetivo) {this.objetivo = objetivo;}
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setId(int id) {this.id = id;}
    public String getIntroduccion() {return introduccion;}
    public void setIntroduccion(String introduccion) {this.introduccion = introduccion;}

    
}
