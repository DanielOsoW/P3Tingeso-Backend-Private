package com.G3Tingeso.PrivateServices.repositories;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Informacion;

/**
 * Informacion_Repository
 */
public interface Informacion_Repository {
    public int countInformacion();
    public List<Informacion> getAllInformacions();
    public boolean createInformacion(Informacion informacion);
    public boolean deleteInformacion(int id);
    public boolean updateInformacion(Informacion informacion);
    public Informacion getInformacion(int id);
    
}