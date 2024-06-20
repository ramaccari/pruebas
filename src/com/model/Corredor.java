package com.model;

public interface Corredor {
	
	public default void corre() {
		System.out.println("Puede correr");
 	}
	
}
