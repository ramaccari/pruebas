package com.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aerolinea {
	
	private String nombre;
	private List<Viaje> viajes = new ArrayList<Viaje>();

	public Aerolinea() {
		super();
	}

	public Aerolinea(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Viaje> getViajes() {
		return viajes;
	}

	public void addViaje(Viaje viaje) {
		viajes.add(viaje);
	}

	@Override
	public String toString() {
		return "Aerolinea [nombre=" + nombre + ", viajes=" + viajes + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, viajes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aerolinea other = (Aerolinea) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(viajes, other.viajes);
	}
	
}
