package com.reference;

import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {
		Consumer<String> consumidor = x -> System.out.println(x);
		consumidor.accept("Hola");
		
		procesar((x) -> System.out.println(x), "Hola modificado por método procesar");
		procesar(TestConsumer::imprimir, "Hola desde método estático imprimir");
		Impresora impresora = new Impresora();
		procesar(impresora::imprimir, "Hola desde la clase Impresora");
	}
	
	public static <T> void procesar(Consumer<T> expresion, T mensaje) {
		expresion.accept(mensaje);
	}
	
	public static void imprimir(String mensaje) {
		System.out.println(mensaje);
	}
}
