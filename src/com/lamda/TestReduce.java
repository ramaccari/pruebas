package com.lamda;

import java.util.OptionalDouble;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class TestReduce {

	public static void main(String[] args) {
		
		// (Para poder reutilizar el Stream
		Supplier<IntStream> supplier = () -> IntStream.of(5, 2, 7, 9, 0);
		
		int total = supplier.get().reduce(0, Integer::sum);
		System.out.println("El total de la lista es: " + total);
		
		total = supplier.get().reduce(0, Integer::min);
		System.out.println("El mínimo de la lista es: " + total);

		total = supplier.get().reduce(0, Integer::max);
		System.out.println("El máximo de la lista es: " + total);
		
		OptionalDouble promedio = supplier.get().average();
		if (promedio.isPresent()) {
			System.out.println("El promedio de la lista es: " + promedio.getAsDouble());
		}
	}

}
