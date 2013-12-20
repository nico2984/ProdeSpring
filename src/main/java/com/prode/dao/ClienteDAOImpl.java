package com.prode.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prode.model.Cliente;

@Repository
public class ClienteDAOImpl implements ClienteDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insertCliente(Cliente cliente) {
		sessionFactory.getCurrentSession().save(cliente);
	}

	@Override
	public Cliente getClienteById(int userId) {
		return (Cliente) sessionFactory.getCurrentSession().get(Cliente.class,
				userId);
	}

	@Override
	public Cliente getCliente(String username) {
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from User where username = :username");
		query.setParameter("username", username);
		return (Cliente) query.list().get(0);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Cliente> getClientes() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(
				Cliente.class);
		return criteria.list();
	}

}