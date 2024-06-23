package com.stream;

import java.util.List;
import java.util.Scanner;

public class TestOptionalIfElse {

	public static void main(String[] args) {
		List<String> cadena = List.of("Hola", "que", "tal", "estás", "hoy");
		System.out.println(cadena);
		
		Scanner scanner = new Scanner(System.in);
		String busca = scanner.next();
		cadena.stream().filter(s -> s.trim().equals(busca)).findFirst().ifPresentOrElse(
				s -> System.out.println(busca + " ESTÁ en la cadena"),
				() -> System.out.println(busca + " NO está en la cadena"));
		scanner.close();
	}

}
