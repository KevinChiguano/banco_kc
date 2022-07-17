package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Cuenta;

public interface ICuentaService {
	
	public void ingresarCuenta(Cuenta cuenta);

	public void actualizarCuenta(Cuenta cuenta);

	public void eliminarCuenta(Integer id);

	public Cuenta buscarCuenta(Integer id);

}
