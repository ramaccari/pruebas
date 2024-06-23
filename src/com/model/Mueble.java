package com.model;

public class Mueble {
	
	private String color;

	public Mueble() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Mueble [color=" + color + "]";
	}

}
