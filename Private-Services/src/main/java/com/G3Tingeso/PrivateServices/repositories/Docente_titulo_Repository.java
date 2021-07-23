package com.G3Tingeso.PrivateServices.repositories;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Docente_titulo;

public interface Docente_titulo_Repository {

    public int countDocente_titulo();
    public List<Docente_titulo> getAllDocente_titulos();
    public boolean createDocente_titulo(Docente_titulo docente_titulo);
    public boolean deleteDocente_titulo(int id);
    public boolean updateDocente_titulo(Docente_titulo docente_titulo);
    public Docente_titulo getDocente_titulo(int id);

}
