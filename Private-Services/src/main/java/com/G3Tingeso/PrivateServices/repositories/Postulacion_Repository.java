package com.G3Tingeso.PrivateServices.repositories;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Postulacion;

/**
 * Postulacion_Repository
 */
public interface Postulacion_Repository {
    public int countPostulacion();
    public List<Postulacion> getAllPostulacions();
    public boolean createPostulacion(Postulacion postulacion);
    public boolean deletePostulacion(int id);
    public boolean updatePostulacion(Postulacion postulacion);
    public Postulacion getPostulacion(int id);
    
}