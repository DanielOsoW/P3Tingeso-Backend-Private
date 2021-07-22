package com.G3Tingeso.PrivateServices.repositories;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Rol_docente;

/**
 * Rol_docente_Repository
 */
public interface Rol_docente_Repository {
    public int countRol_docente();
    public List<Rol_docente> getAllRol_docentes();
    public boolean createRol_docente(Rol_docente rol_docente);
    public boolean deleteRol_docente(int id);
    public boolean updateRol_docente(Rol_docente rol_docente);
    public Rol_docente getRol_docente(int id);
}