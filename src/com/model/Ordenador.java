package com.model;

public class Ordenador {
	private int numero;
	private String sistema;
	private double precio;

	public Ordenador() {
		super();
	}

	public Ordenador(int numero, String sistema, double precio) {
		super();
		this.numero = numero;
		this.sistema = sistema;
		this.precio = precio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Ordenador [numero=" + numero + ", sistema=" + sistema + ", precio=" + precio + "]";
	}

}
