package com.generalidades;

import java.time.Duration;
import java.time.Instant;

import com.service.Counter;

public class AtomicCounter {

	public static void main(String[] args) {
		int hilosFinalizados = 0;
		boolean preguntar1 = true;
		boolean preguntar2 = true;
		boolean preguntar3 = true;
		boolean preguntar4 = true;
		boolean preguntar5 = true;

		// Instancia de Counter.class
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		// Se definen cuatro hilos diferentes
		Thread hilo1 = new Thread(c1);
		hilo1.setPriority(Thread.MIN_PRIORITY);
		Thread hilo2 = new Thread(c1);
		hilo2.setPriority(Thread.NORM_PRIORITY);
		Thread hilo3 = new Thread(c1);
		hilo3.setPriority(Thread.NORM_PRIORITY);
		Thread hilo4 = new Thread(c1);
		hilo4.setPriority(Thread.MAX_PRIORITY);
		Thread hilo5 = new Thread(c2);
		hilo5.setPriority(Thread.NORM_PRIORITY);

		// Se ejecutan los hilos
		Instant inicio = Instant.now();
		System.out.println("Inicio hilo 1");
		hilo1.start();
		System.out.println("Inicio hilo 2");
		hilo2.start();
		System.out.println("Inicio hilo 3");
		hilo3.start();
		System.out.println("Inicio hilo 4");
		hilo4.start();
		System.out.println("Inicio hilo 5");
		hilo5.start();

		// El hilo principal espera a que todos los hilos terminen
		do {
			if (preguntar1 && !hilo1.isAlive()) {
				Instant fin1 = Instant.now();
				preguntar1 = false;
				System.out.println("Hilo 1 terminado en: " + Duration.between(inicio, fin1).toSeconds() + " segundos");
				hilosFinalizados++;
			}

			if (preguntar2 && !hilo2.isAlive()) {
				Instant fin2 = Instant.now();
				preguntar2 = false;
				System.out.println("Hilo 2 terminado en: " + Duration.between(inicio, fin2).toSeconds() + " segundos");
				hilosFinalizados++;
			}

			if (preguntar3 && !hilo3.isAlive()) {
				Instant fin3 = Instant.now();
				preguntar3 = false;
				System.out.println("Hilo 3 terminado en: " + Duration.between(inicio, fin3).toSeconds() + " segundos");
				hilosFinalizados++;
			}

			if (preguntar4 && !hilo4.isAlive()) {
				Instant fin4 = Instant.now();
				preguntar4 = false;
				System.out.println("Hilo 4 terminado en: " + Duration.between(inicio, fin4).toSeconds() + " segundos");
				hilosFinalizados++;
			}

			if (preguntar5 && !hilo5.isAlive()) {
				Instant fin5 = Instant.now();
				preguntar5 = false;
				System.out.println("Hilo 5 terminado en: " + Duration.between(inicio, fin5).toSeconds() + " segundos");
				hilosFinalizados++;
			}
		} while (hilosFinalizados < 5);

		// Se imprime el valor de la variable atómica en instancia compartida
		System.out.println("El valor final de la variable atómica en instancia compartida es: " + c1.count);
		
		// Se imprime el valor de la variable atómica en única compartida
		System.out.println("El valor final de la variable atómica en única instancia es: " + c2.count);
	}

}
