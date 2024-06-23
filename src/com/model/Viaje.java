package com.model;

import java.util.Objects;

public class Viaje {
	
	private String pais;

	public Viaje() {
		super();
	}

	public Viaje(String pais) {
		super();
		this.pais = pais;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Viaje [pais=" + pais + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(pais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Viaje other = (Viaje) obj;
		return Objects.equals(pais, other.pais);
	}
	
}
