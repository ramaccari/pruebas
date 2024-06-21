package com.model;

import java.util.Objects;

import com.service.Comprable;

public class Impresora implements Comprable, Imprimible {

	private String modelo;
	private String marca;
	private double precio;

	public Impresora() {
		super();
	}

	public Impresora(String modelo, String marca, double precio) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Impresora other = (Impresora) obj;
		return Objects.equals(marca, other.marca);
	}

	@Override
	public String toString() {
		return "Impresora [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + "]";
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimiendo desde la Impresora");
	}
	
}
