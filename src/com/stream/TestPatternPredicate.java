package com.stream;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class TestPatternPredicate {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("hola", "41", "6", "227", "estás", "3219");
		
		// Se utiliza un Pattern para testear que sea un número
		Pattern patron = Pattern.compile("\\d");
		
		// El patrón se pasa como predicado al filtro
		stream.filter(patron.asPredicate()).map(Integer::parseInt).forEach(System.out::println);
	}

}
