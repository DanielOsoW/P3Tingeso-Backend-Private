package com.G3Tingeso.PrivateServices.repositories;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Carta;

/**
 * Carta_Repository
 */
public interface Carta_Repository {
    public int countCarta();
    public List<Carta> getAllCartas();
    public boolean createCarta(Carta carta);
    public boolean deleteCarta(int id);
    public boolean updateCarta(Carta carta);
    public Carta getCarta(int id);
    
}