package com.uce.edu.demo;

import java.math.BigDecimal;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Cuenta;
import com.uce.edu.demo.modelo.Transaccion;
import com.uce.edu.demo.modelo.Usuario;
import com.uce.edu.demo.service.ICuentaService;
import com.uce.edu.demo.service.ITransaccionService;
import com.uce.edu.demo.service.IUsuarioService;

@SpringBootApplication
public class BancoKcApplication implements CommandLineRunner{
	
	private static final Logger LOGGER = Logger.getLogger(BancoKcApplication.class);

	@Autowired
	private ICuentaService cuentaService;
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private ITransaccionService transaccionService;
	
	public static void main(String[] args) {
		SpringApplication.run(BancoKcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Cuenta cuenta = new Cuenta();
		//cuenta.setNumeroCuenta(1);
		cuenta.setSaldo(new BigDecimal(60));
		cuenta.setTipo("Ahorros");
		
		this.cuentaService.ingresarCuenta(cuenta);
		//this.cuentaService.eliminarCuenta(2);
		//LOGGER.info(this.cuentaService.buscarCuenta(1));
		//this.cuentaService.actualizarCuenta(cuenta);
		
		Usuario usuario = new Usuario();
		//usuario.setId(2);
		usuario.setNombre("Alan");
		usuario.setApellido("Peterson");
		usuario.setEdad(25);
		
		this.usuarioService.ingresarUsuario(usuario);
		//this.usuarioService.eliminarUsuario(1);
		//this.usuarioService.actualizarUsuario(usuario);
		//LOGGER.info(this.usuarioService.buscarUsuario(2));
		
		Transaccion transaccion = new Transaccion();
		//transaccion.setId(2);
		transaccion.setMonto(new BigDecimal(10));
		transaccion.setTipo("Transferencia");
		
		this.transaccionService.ingresarTransaccion(transaccion);
		//this.transaccionService.eliminarTransaccion(1);
		//this.transaccionService.actualizarTransaccion(transaccion);
		//LOGGER.info(this.transaccionService.buscarTransaccion(2));
		
		
	}

}
