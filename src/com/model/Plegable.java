package com.model;

public interface Plegable {

	public default void plegar() {
		System.out.println("Se puede plegar");
	}

}
