package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Transaccion;

@Repository
@Transactional
public class TransaccionRepositoryImpl implements ITransaccionRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void ingresar(Transaccion transaccion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(transaccion);
	}

	@Override
	public void actualizar(Transaccion transaccion) {
		// TODO Auto-generated method stub
		this.entityManager.merge(transaccion);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Transaccion transaccion = this.buscar(id);
		this.entityManager.remove(transaccion);
	}

	@Override
	public Transaccion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Transaccion.class, id);
	}

}
