package com.prode.service;

import java.util.List;

import com.prode.model.Parametro;



public interface ParametroService {
    
	public List<Parametro> findAll();

    public void save(Parametro parametro);

    public void remove(int id);

    public Parametro find(int id);
    
    public boolean getCargaHabilitadaTPFaseGrupo();
}
