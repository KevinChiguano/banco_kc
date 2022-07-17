package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Usuario;

public interface IUsuarioService {
	
	public void ingresarUsuario(Usuario usuario);

	public void actualizarUsuario(Usuario usuario);

	public void eliminarUsuario(Integer id);

	public Usuario buscarUsuario(Integer id);

}
