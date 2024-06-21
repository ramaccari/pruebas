package com.stream;

import java.util.Arrays;
import java.util.List;

public class TestTakewhile {

	public static void main(String[] args) {
		// takeWhile se introdujo en Java 9 
		List<String> lista = Arrays.asList("Hola","que","tal","estás","hoy","aquí");
		System.out.println("Cadena original");
		lista.forEach(System.out::println);
		
		System.out.println("Cadena hasta que la palabra tenga menos de 5 letras");
		lista.stream().takeWhile(s -> s.length() < 5).forEachOrdered(System.out::println);
	}

}
