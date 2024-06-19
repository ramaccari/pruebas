package com.reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestHighOrder {

	public static void main(String[] args) {
		List<String> listaNombres = new ArrayList<>(5);
		listaNombres.add("Roberto");
		listaNombres.add("Olga");
		listaNombres.add("Ana Luz");
		listaNombres.add("Anabella");
		listaNombres.add("Cristina");

		/*
		 * Toido esto se puede reemplazar gracias a los métodos creados
		 * Predicate<String> filtro = (nombre) -> nombre.length() < 5;
		 * System.out.println("Nombres con menos de 5 caracteres");
		 * listaNombres.stream().filter(filtro).forEach(System.out::println);
		 * 
		 * filtro = (nombre) -> nombre.length() < 8;
		 * System.out.println("Nombres con menos de 8 caracteres");
		 * listaNombres.stream().filter(filtro).forEach(System.out::println);
		 * 
		 * filtro = (nombre) -> nombre.length() < 11;
		 * System.out.println("Nombres con menos de 11 caracteres");
		 * listaNombres.stream().filter(filtro).forEach(System.out::println);
		 */
		System.out.println("Nombres con menos de 5 caracteres");
		imprimir(listaNombres, System.out::println, 5);

		System.out.println("Nombres con menos de 8 caracteres");
		imprimir(listaNombres, System.out::println, 8);

		System.out.println("Nombres con menos de 9 caracteres");
		imprimir(listaNombres, System.out::println, 9);
	}

	// High Order function que devuelve un Predicate
	public static Predicate<String> menosQue(final int tope) {
		return texto -> texto.length() < tope;
	}

	// High Order function que utiliza la otra funsión para el algoritmo de filtrado
	// y aplica el consumidor pasado
	public static void imprimir(List<String> listaNombres, Consumer<String> consumidor, int tope) {
		listaNombres.stream().filter(menosQue(tope)).forEach(consumidor);
	}

}
