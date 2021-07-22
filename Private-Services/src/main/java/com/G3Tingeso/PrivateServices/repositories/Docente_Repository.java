package com.G3Tingeso.PrivateServices.repositories;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Docente;

/**
 * Docente_Repository
 */
public interface Docente_Repository {
    public int countDocente();
    public List<Docente> getAllDocentes();
    public boolean createDocente(Docente docente);
    public boolean deleteDocente(int id);
    public boolean updateDocente(Docente docente);
    public Docente getDocente(int id);
    
}