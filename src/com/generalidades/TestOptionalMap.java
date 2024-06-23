package com.generalidades;

import java.util.Optional;

public class TestOptionalMap {

	public static void main(String[] args) {
		String i = "algo";
		System.out.println("Texto original: " + i);
		Optional<String> o = Optional.ofNullable(i);
		
		// Al ser un Optional podemos hacer map y chequeo de nulos
		o.map(String::toUpperCase).ifPresent(System.out::println);
	}

}
