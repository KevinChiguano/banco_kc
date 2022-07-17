package com.uce.edu.demo.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "transaccion")
public class Transaccion {

	@Id
	@Column(name = "trans_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trans_id_seq")
	@SequenceGenerator(name = "trans_id_seq", sequenceName = "trans_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "trans_tipo")
	private String tipo;

	@Column(name = "trans_monto")
	private BigDecimal monto;

	@Override
	public String toString() {
		return "Transaccion [id=" + id + ", tipo=" + tipo + ", monto=" + monto + "]";
	}

	//GET y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

}
