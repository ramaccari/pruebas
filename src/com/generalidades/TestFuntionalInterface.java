package com.generalidades;

import com.service.Matematicas;

public class TestFuntionalInterface {

	public static void main(String[] args) {
		Matematicas suma = (x, y) -> x + y;
		System.out.println("3 + 2 = " + suma.operacion(3, 2));
		
		Matematicas multiplicacion = (x, y) -> x * y;
		System.out.println("3 * 2 = " + multiplicacion.operacion(3, 2));
		
		Matematicas resta = (x, y) -> x - y;
		System.out.println("3 - 2 = " + resta.operacion(3, 2));
		
		Matematicas division = (x, y) -> x / y;
		System.out.println("3 / 2 = " + division.operacion(3, 2));
	}

}
