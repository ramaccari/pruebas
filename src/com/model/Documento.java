package com.model;

public class Documento {
	private String tipo;
	private String contenido;

	public Documento() {
		super();
	}

	public Documento(String tipo, String contenido) {
		super();
		this.tipo = tipo;
		this.contenido = contenido;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Documento [tipo=" + tipo + ", contenido=" + contenido + "]";
	}
	
}
