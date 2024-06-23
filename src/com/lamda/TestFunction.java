package com.lamda;

import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {
		Function<Double, Double> doble = x -> x + x;
		Function<Double, Double> cuadrado = x -> Math.pow(x, 2);
		
		// Se combinan ambas funciones
		Function<Double, Double> dobleAndCuadrado = doble.andThen(cuadrado);
		Function<Double, Double> cuadradoAndDoble = cuadrado.andThen(doble);
		
		double valor = 5.0;
		System.out.println("(El doble de " + valor + ") elevado al cuadrado es: " + dobleAndCuadrado.apply(valor));
		System.out.println("El doble de (" + valor + " elevado al cuadrado) es: " + cuadradoAndDoble.apply(valor));
	}

}
