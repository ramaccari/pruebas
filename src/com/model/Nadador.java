package com.model;

public interface Nadador {

	public default void nada() {
		System.out.println("Puede nadar");
	}
	
}
