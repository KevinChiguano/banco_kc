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
@Table(name = "cuenta")
public class Cuenta {

	@Id
	@Column(name = "cuen_numero_cuenta")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cuen_numero_cuenta_seq")
	@SequenceGenerator(name = "cuen_numero_cuenta_seq", sequenceName = "cuen_numero_cuenta_seq", allocationSize = 1)
	private Integer numeroCuenta;

	@Column(name = "cuen_saldo")
	private BigDecimal saldo;

	@Column(name = "cuen_tipo")
	private String tipo;

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", tipo=" + tipo + "]";
	}

	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
