package com.uce.edu.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@Column(name = "usua_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usua_id_seq")
	@SequenceGenerator(name = "usua_id_seq", sequenceName = "usua_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "usua_nombre")
	private String nombre;
	
	@Column(name = "usua_apellido")
	private String apellido;
	
	@Column(name = "usua_edad")
	private Integer edad;
	
	
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	//GET y SET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	

}
