package com.prode.service;

import java.util.List;

import com.prode.model.Provincia;


public interface ProvinciaService {
    public List<Provincia> findAll();

    public void save(Provincia provincia);

    public void remove(int id);

    public Provincia find(int id);
    
    
}
