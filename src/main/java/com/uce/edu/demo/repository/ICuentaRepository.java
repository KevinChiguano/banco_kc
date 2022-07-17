package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Cuenta;

public interface ICuentaRepository {

	public void ingresar(Cuenta cuenta);

	public void actualizar(Cuenta cuenta);

	public void eliminar(Integer numeroCuenta);

	public Cuenta buscar(Integer numeroCuenta);

}
