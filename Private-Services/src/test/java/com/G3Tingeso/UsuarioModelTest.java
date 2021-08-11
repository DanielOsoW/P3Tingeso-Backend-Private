package com.G3Tingeso;
import com.G3Tingeso.PrivateServices.models.Usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsuarioModelTest{

    int id = 1;
    String email = "email";
    String password = "password";
    int id_docente = 2;
    int id_rol = 3;

    Usuario usuario = new Usuario();

    @Test
    public void testId(){
        usuario.setId(1);
        Assertions.assertEquals(id, usuario.getId(), "Listo");
    }
    @Test
    public void testEmail(){
        usuario.setEmail("email");
        Assertions.assertEquals(email, usuario.getEmail(), "Listo");
    }
    @Test
    public void testPassword(){
        usuario.setPassword("password");
        Assertions.assertEquals(password, usuario.getPassword(), "Listo");
    }
    @Test
    public void testId_docente(){
        usuario.setId_docente(2);
        Assertions.assertEquals(id_docente, usuario.getId_docente(), "Listo");
    }
    @Test
    public void testId_rol(){
        usuario.setId_rol(3);
        Assertions.assertEquals(id_rol, usuario.getId_rol(), "Listo");
    }
}