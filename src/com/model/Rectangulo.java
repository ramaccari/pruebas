package com.model;

public class Rectangulo implements Figura {

	private int ladoA;
	private int ladoB;
	
	public Rectangulo() {
		this(2, 2);
	}

	public Rectangulo(int ladoA, int ladoB) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	public int getLadoA() {
		return ladoA;
	}

	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}

	@Override
	public double area() {
		return this.ladoA * this.ladoB;
	}

	@Override
	public String toString() {
		return "Rectangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + "]";
	}

}
