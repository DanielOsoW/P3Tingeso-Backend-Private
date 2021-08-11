package com.G3Tingeso;
import com.G3Tingeso.PrivateServices.repositories.Rol_docente_Repository;
import com.G3Tingeso.PrivateServices.repositories.Rol_docente_RepositoryImp;
import com.G3Tingeso.PrivateServices.models.Rol;
import com.G3Tingeso.PrivateServices.services.RolService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class Rol_docenteModelTest{
    
    int id = 1;
    String descripcion = "rol_docente";

    Rol_docente rol_docente = new Rol_docente();

    @Test
    public void testId(){
        rol_docente.setId(1);
        Assertions.assertEquals(id, rol_docente.getId(), "Listo");
    }
    @Test
    public void testDescription(){
        rol_docente.setDescripcion("rol_docente");
        Assertions.assertEquals(descripcion, rol_docente.getDescripcion(), "Listo");
    }
    
}