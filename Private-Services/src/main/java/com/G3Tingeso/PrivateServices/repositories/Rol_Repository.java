package com.G3Tingeso.PrivateServices.repositories;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Rol;

/**
 * Rol_Repository
 */
public interface Rol_Repository {

    public int countRol();
    public List<Rol> getAllRols();
    public boolean createRol(Rol rol);
    public boolean deleteRol(int id);
    public boolean updateRol(Rol rol);
    public Rol getRol(int id);
}