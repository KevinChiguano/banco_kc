package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Transaccion;
import com.uce.edu.demo.repository.ITransaccionRepository;

@Service
public class TransaccionServiceImpl implements ITransaccionService{

	@Autowired
	private ITransaccionRepository transaccionRepository;
	
	@Override
	public void ingresarTransaccion(Transaccion transaccion) {
		// TODO Auto-generated method stub
		this.transaccionRepository.ingresar(transaccion);
	}

	@Override
	public void actualizarTransaccion(Transaccion transaccion) {
		// TODO Auto-generated method stub
		this.transaccionRepository.actualizar(transaccion);
	}

	@Override
	public void eliminarTransaccion(Integer id) {
		// TODO Auto-generated method stub
		this.transaccionRepository.eliminar(id);
	}

	@Override
	public Transaccion buscarTransaccion(Integer id) {
		// TODO Auto-generated method stub
		return this.transaccionRepository.buscar(id);
	}

}
