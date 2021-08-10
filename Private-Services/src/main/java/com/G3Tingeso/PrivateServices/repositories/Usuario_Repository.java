package com.G3Tingeso.PrivateServices.repositories;
import java.util.List;
import com.G3Tingeso.PrivateServices.models.Usuario;

/**
 * Usuario_Repository
 */
public interface Usuario_Repository {

    public int countUsuario();
    public List<Usuario> getAllUsuarios();
    public boolean createUsuario(Usuario usuario);
    public boolean deleteUsuario(int id);
    public boolean updateUsuario(Usuario usuario);
    public Usuario getUsuario(int id);
    public String getLogin(String email, String password);
}