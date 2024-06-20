package com.model;

import java.util.Objects;

import com.service.Comprable;

public class Libro implements Comprable {

	private String titulo;
	private String categoria;
	private int paginas;
	private double precio;

	public Libro() {
		super();
	}

	public Libro(String titulo, String categoria, int paginas, double precio) {
		super();
		this.titulo = titulo;
		this.categoria = categoria;
		this.paginas = paginas;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", categoria=" + categoria + ", paginas=" + paginas + ", precio=" + precio
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(titulo, other.titulo);
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
