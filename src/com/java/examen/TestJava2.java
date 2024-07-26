package com.java.examen;

public class TestJava2 {

	static int[] myArray = { 1, 2, 2, 4, 5, 6, 7, 8, 8, 8 };

	public static void main(String[] args) {
		// Longitud de la secuencia actual
		int longestSequence = 1;

		// Número actual
		int currentNumber = myArray[0];

		// Longitud máxima de secuencia
		int maxSequence = 1;

		// Número con la secuencia más larga
		int numberWithMaxSequence = currentNumber;

		for (int i = 1; i < myArray.length; i++) {
			if (myArray[i] == currentNumber) {
				longestSequence++;
			} else {
				// Reinicio la secuencia
				if (longestSequence > maxSequence) {
					maxSequence = longestSequence;
					numberWithMaxSequence = currentNumber;
				}
				currentNumber = myArray[i];
				longestSequence = 1;
			}
		}

		// Verifico si la última secuencia es la más larga
		if (longestSequence > maxSequence) {
			maxSequence = longestSequence;
			numberWithMaxSequence = currentNumber;
		}

		// Imprimo los resultados
		System.out.println("Longest: " + maxSequence);
		System.out.println("Number: " + numberWithMaxSequence);
	}

}
