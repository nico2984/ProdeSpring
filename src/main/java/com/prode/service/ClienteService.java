
package com.prode.service;

import java.util.List;

import com.prode.model.Cliente;

public interface ClienteService {

  void insertCliente(Cliente cliente);
	
  Cliente getClienteById(int userId);
	
  Cliente getCliente(String username);
	
  List<Cliente> getClientes();
}
