package com.model;

public class Factura {
	private int numero;
	private double importe;
	private TipoIva tipo;

	public Factura(int numero, double importe, TipoIva tipo) {
		super();
		this.numero = numero;
		this.importe = importe;
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public TipoIva getTipo() {
		return tipo;
	}

	public void setTipo(TipoIva tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", importe=" + importe + ", tipo=" + tipo + "]";
	}
	
}
