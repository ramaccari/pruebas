package com.model;

public interface Imprimible {

	public void imprimir();
	
	public default void encender() {
		formatear("Dispositivo encendido");
	}
	
	public default void apagar() {
		formatear("Dispositivo apagado");
	}

	private void formatear(String msg) {
		// Métodos privados en Interfaces legan con Java 9
		System.out.println("**********");
		System.out.println(msg);
		System.out.println("**********");
	};
}
