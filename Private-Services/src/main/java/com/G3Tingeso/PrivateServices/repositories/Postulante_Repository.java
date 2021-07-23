package com.G3Tingeso.PrivateServices.repositories;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Postulante;

public interface Postulante_Repository {
    public int countPostulante();
    public List<Postulante> getAllPostulantes();
    public boolean createPostulante(Postulante postulante);
    public boolean deletePostulante(int id);
    public boolean updatePostulante(Postulante postulante);
    public Postulante getPostulante(int id);
}
