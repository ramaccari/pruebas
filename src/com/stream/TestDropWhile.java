package com.stream;

import java.util.Arrays;
import java.util.List;

public class TestDropWhile {

	public static void main(String[] args) {
		// dropWhile se introdujo en Java 9
		List<String> lista = Arrays.asList("Hola","que","tal","estás","hoy","aquí");
		System.out.println("Cadena original");
		lista.forEach(System.out::println);
		
		System.out.println("Cadena despúes de encontrar una palabra que tenga más de 4 letras");
		lista.stream().dropWhile(s -> s.length() < 5).forEachOrdered(System.out::println);
	}

}
