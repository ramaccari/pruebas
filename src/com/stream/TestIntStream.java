package com.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TestIntStream {

	public static void main(String[] args) {
		int factorial = IntStream.range(1, 10).reduce(1, (x, y) -> x * y);
		System.out.println("El factoral de 9 es: " + factorial);
		
		String str = "Hola mi nombre completo es Roberto Anibal Maccari";
		System.out.println("Tengo la frase: " + str);
		String[] array = str.split(" ");
		System.out.println("Tiene " + array.length + " palabras");
		double promedio = Arrays.stream(array).mapToInt(String::length).average().getAsDouble();
		System.out.println("El largo promedio de cada palabra es: " + promedio);
	}

}
