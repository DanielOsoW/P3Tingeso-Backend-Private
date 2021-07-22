package com.G3Tingeso.PrivateServices.repositories;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Titulo;

/**
 * Titulo_Repository
 */
public interface Titulo_Repository {
    public int countTitulo();
    public List<Titulo> getAllTitulos();
    public boolean createTitulo(Titulo titulo);
    public boolean deleteTitulo(int id);
    public boolean updateTitulo(Titulo titulo);
    public Titulo getTitulo(int id);
    
}