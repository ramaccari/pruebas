package com.lamda;

import java.util.function.BiFunction;

public class TestInferredType {

	public static void main(String[] args) {
		double op1 = 2;
		double op2 = 2;
		
		// Se define a los dos argumentos y al resultado como Double
		BiFunction<Double, Double, Double> f = (x, y) -> x + y;
		
		// Se utiliza el function previamente declarada
		System.out.printf("La suma de %.2f y %.2f es = a %.2f", op1, op2, f.apply(op1, op2));
	}

}
