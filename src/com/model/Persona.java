package com.model;

import com.service.InformacionObjeto;

public class Persona implements InformacionObjeto {
	
	private String nombre;
	private int edad;

	public Persona() {
		super();
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
}
