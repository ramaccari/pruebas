package com.stream;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class TestStringAsStream {

	public static void main(String[] args) {
		String texto = "nombre:Roberto,nombre:Olga,nombre:Ana Luz,nombre:Anabella";
		
		// Se utiliza Pattern para obtener un Stream de String
		Stream<String> bloques = Pattern.compile(",").splitAsStream(texto);
		
		// Luego operamos para obtener lo que nos intereza
		bloques.map(cadena -> cadena.substring(7, cadena.length())).forEach(System.out::println);

	}

}
