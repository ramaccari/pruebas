package com.stream;

import java.util.Arrays;
import java.util.List;

public class TestStreamPeek {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Hola", "qué", "tal", "estás", "tu");
		
		// Vemos el comportamiento paso a paso (resultado por System.err)
		lista.stream().peek(l -> {
			System.out.println("Inicio: " + l);
		}).filter(l -> l.length() > 3).peek(l -> {
			System.out.println("Filtro más de 3 caracteres: " + l);
		}).map(l -> l.toUpperCase()).peek(l -> {
			System.out.println("Paso a mayúsculas: " + l);
		}).forEach(System.err::println);
	}

}
