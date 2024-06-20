package com.model;

public interface Ciclista {
	
	public default void pedalea() {
		System.out.println("Puede andar en bicicleta");
	}
		
}
