package com.prode.service;

import java.util.List;

import com.prode.model.Cliente;
import com.prode.model.RespuestaCliente;


public interface RespuestaClienteService {
    public List<RespuestaCliente> findAll();

    public void save(RespuestaCliente respuestaCliente);

    public void remove(int id);

    public RespuestaCliente find(int id);
    
    public RespuestaCliente findRespuestaCliente(Cliente cliente);
    
    public boolean isTriviaJugada(Cliente cliente);
    
}
