package com.G3Tingeso.PrivateServices.repositories;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Diplomado_docente;

public interface Diplomado_docente_Repository {
    
    public int countDiplomado_docente();
    public List<Diplomado_docente> getAllDiplomado_docentes();
    public boolean createDiplomado_docente(Diplomado_docente diplomado_docente);
    public boolean deleteDiplomado_docente(int id);
    public boolean updateDiplomado_docente(Diplomado_docente diplomado_docente);
    public Diplomado_docente getDiplomado_docente(int id);

}
