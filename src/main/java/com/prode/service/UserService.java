package com.prode.service;

import java.util.List;

import com.prode.model.Usuario;


public interface UserService {
    public List<Usuario> findAll();

    public void save(Usuario usuario);

    public void remove(int id);

    public Usuario find(int id);
    
    public Usuario login(String usuario, String password);
    
    
}
