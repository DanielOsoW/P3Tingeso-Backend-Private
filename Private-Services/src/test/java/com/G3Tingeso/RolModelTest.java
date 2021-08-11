package com.G3Tingeso;
import com.G3Tingeso.PrivateServices.repositories.Rol_Repository;
import com.G3Tingeso.PrivateServices.repositories.Rol_RepositoryImp;
import com.G3Tingeso.PrivateServices.models.Rol;
import com.G3Tingeso.PrivateServices.services.RolService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class RolModelTest{
    
    int id = 1;
    String descripcion = "Rol";

    Rol rol = new Rol();

    @Test
    public void testId(){
        rol.setId(1);
        Assertions.assertEquals(id, rol.getId(), "Listo");
    }
    @Test
    public void testDescription(){
        rol.setDescripcion("Rol");
        Assertions.assertEquals(descripcion, rol.getDescripcion(), "Listo");
    }

}