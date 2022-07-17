package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Transaccion;

public interface ITransaccionRepository {

	public void ingresar(Transaccion transaccion);

	public void actualizar(Transaccion transaccion);

	public void eliminar(Integer id);

	public Transaccion buscar(Integer id);
	
}
