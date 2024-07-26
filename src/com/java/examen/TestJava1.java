package com.java.examen;

public class TestJava1 {

	static int[] myArray = {1,2,1,3,3,1,2,1,5,1};
	
	public static void main(String[] args) {

		// Inicializo un arreglo para contar las frecuencias
		int[] frequencies = new int[6]; // voy a utilizar los Índices 1 al 5

		// Cuento las ocurrencias de cada número
		for (int num : myArray) {
			frequencies[num]++;
		}

		// Imprimo el histograma
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + ": ");
			for (int j = 0; j < frequencies[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
