package com.prode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prode.dao.ClienteDAO;
import com.prode.model.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteDAO clienteDAO;

	@Transactional
	public void insertCliente(Cliente cliente) {
		clienteDAO.insertCliente(cliente);
	}

	@Transactional
	public Cliente getClienteById(int userId) {
		return clienteDAO.getClienteById(userId);
	}

	@Transactional
	public Cliente getCliente(String username) {
		return clienteDAO.getCliente(username);
	}

	@Transactional
	public List<Cliente> getClientes() {
		return clienteDAO.getClientes();
	}

}