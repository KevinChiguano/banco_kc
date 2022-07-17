package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Transaccion;

public interface ITransaccionService {

	public void ingresarTransaccion(Transaccion transaccion);

	public void actualizarTransaccion(Transaccion transaccion);

	public void eliminarTransaccion(Integer id);

	public Transaccion buscarTransaccion(Integer id);
	
}
