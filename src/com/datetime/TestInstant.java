package com.datetime;

import java.time.Duration;
import java.time.Instant;

public class TestInstant {

	public static void main(String[] args) {
		
		// Utilizada para calcular el tiempo pasado entre dos instantes
		Instant instanteA = Instant.now();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Instant instanteB = Instant.now();
		System.out.println("Pasaron " + Duration.between(instanteA, instanteB).getSeconds() + " segundos");
	}

}
