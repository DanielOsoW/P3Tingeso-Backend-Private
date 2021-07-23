package com.G3Tingeso.PrivateServices.models;

/**
 * Diplomado_docente
 */
public class Diplomado_docente {

    private int id;
    private int id_docente;
    private int id_diplomado;

    /**
     * @return int return the id
     */
    public int getId() {return id;}

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return int return the id_docente
     */
    public int getId_docente() {
        return id_docente;
    }

    /**
     * @param id_docente the id_docente to set
     */
    public void setId_docente(int id_docente) {this.id_docente = id_docente;}

    public int getId_diplomado() {
        return this.id_diplomado;
    }
    public void setId_diplomado(int id_diplomado) {
        this.id_diplomado = id_diplomado;
    }
   
   


}