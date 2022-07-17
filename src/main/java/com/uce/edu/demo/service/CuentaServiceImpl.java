package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Cuenta;
import com.uce.edu.demo.repository.ICuentaRepository;

@Service
public class CuentaServiceImpl implements ICuentaService{
	
	@Autowired
	private ICuentaRepository cuentaRepository;

	@Override
	public void ingresarCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepository.ingresar(cuenta);
	}

	@Override
	public void actualizarCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepository.actualizar(cuenta);
	}

	@Override
	public void eliminarCuenta(Integer id) {
		// TODO Auto-generated method stub
		this.cuentaRepository.eliminar(id);
	}

	@Override
	public Cuenta buscarCuenta(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaRepository.buscar(id);
	}

}
