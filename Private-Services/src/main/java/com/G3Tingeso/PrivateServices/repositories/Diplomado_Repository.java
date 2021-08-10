package com.G3Tingeso.PrivateServices.repositories;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Diplomado;

public interface Diplomado_Repository {
    public int countDiplomado();
    public List<Diplomado> getAllDiplomados();
    public boolean createDiplomado(Diplomado diplomado);
    public boolean deleteDiplomado(int id);
    public boolean updateDiplomado(Diplomado diplomado);
    public Diplomado getDiplomado(int id);
    public List<Diplomado> getDiplomadoByPostulante(int id);
    
}
