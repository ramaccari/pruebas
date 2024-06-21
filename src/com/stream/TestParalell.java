package com.stream;

import java.util.stream.IntStream;

public class TestParalell {

	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();

		IntStream lista = IntStream.range(1, 10);
		int total = lista.map(TestParalell::duplicar).sum();

		long t2 = System.currentTimeMillis();
		System.out.println("Tiempo con Strem normal   : " + (t2 - t1));
		System.out.println("Resultado con Strem normal: " + total);

		long t3 = System.currentTimeMillis();

		lista = IntStream.range(1, 10);
		total = lista.parallel().map(TestParalell::duplicar).sum();

		long t4 = System.currentTimeMillis();
		System.out.println("Tiempo con Strem Paralell   : " + (t4 - t3));
		System.out.println("Resultado con Strem Paralell: " + total);
}

	private static int duplicar(int numero) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.getMessage();
			e.printStackTrace();
		}

		return numero * 2;
	}

}
