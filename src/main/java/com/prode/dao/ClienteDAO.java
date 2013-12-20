package com.prode.dao;

import java.util.List;

import com.prode.model.Cliente;

public interface ClienteDAO {

	void insertCliente(Cliente cliente);

	Cliente getClienteById(int clienteId);

	Cliente getCliente(String username);

	List<Cliente> getClientes();
}