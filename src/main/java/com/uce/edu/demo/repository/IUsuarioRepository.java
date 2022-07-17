package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Usuario;

public interface IUsuarioRepository {

	public void ingresar(Usuario usuario);

	public void actualizar(Usuario usuario);

	public void eliminar(Integer id);

	public Usuario buscar(Integer id);
	
}
