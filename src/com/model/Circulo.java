package com.model;

public class Circulo implements Figura {
	
	private int radio;
	
	public Circulo() {
		this(2);
	}

	public Circulo(int radio) {
		super();
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public double area() {
		return  Math.PI * Math.pow(radio, 2);
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

}
