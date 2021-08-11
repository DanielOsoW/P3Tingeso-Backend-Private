package com.G3Tingeso;
import com.G3Tingeso.PrivateServices.models.Rol;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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