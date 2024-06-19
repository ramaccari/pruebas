package com.stream;

import java.util.stream.IntStream;

public class TestInfiniteStream {
	
	private static final int LIMITE = 100000;

	public static void main(String[] args) {
		long t1 = System.nanoTime();
		
		int total = 0;
		for (int i = 1; i <= LIMITE; i++) {
			total += i;
		}
		
		long t2 = System.nanoTime();
		System.out.println("Con bucle for");
		System.out.printf("Resultado: %d en %d nanosegundos", total, t2 - t1);
		System.out.println();
		
		t1 = System.nanoTime();
		total = IntStream.iterate(1, i -> i + 1).limit(LIMITE).sum();
		t2 = System.nanoTime();
		System.out.println("Con bucle Infinite Stream");
		System.out.printf("Resultado: %d en %d nanosegundos", total, t2 - t1);
		System.out.println();
	
		t1 = System.nanoTime();
		total = IntStream.iterate(1, i -> i + 1).limit(LIMITE).parallel().sum();
		t2 = System.nanoTime();
		System.out.println("Con bucle Infinite Stream en paralelo");
		System.out.printf("Resultado: %d en %d nanosegundos", total, t2 - t1);
		System.out.println();
	
	}

}
