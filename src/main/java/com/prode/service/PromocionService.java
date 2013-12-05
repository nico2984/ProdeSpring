package com.prode.service;

import java.util.List;

import com.prode.model.Promocion;


public interface PromocionService {
    public List<Promocion> findAll();

    public void save(Promocion promocion);

    public void remove(int id);

    public Promocion find(int id);
    
    public Promocion findPromocionVigente();
    
}
