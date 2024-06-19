package com.generalidades;

import com.model.Persona;

public class TestMetodos {

	public static void main(String[] args) {
		System.out.println("Variable primitiva");
		int a = 5;
		System.out.println("Inicia en  : " + a);
		duplico(a);
		System.out.println("Valor final: " + a);
		
		System.out.println("Variable String");
		String nombre = "Roberto";
		System.out.println("Inicia en  : " + nombre);
		cambioNombre(nombre);
		System.out.println("Valor final: " + nombre);
		
		System.out.println("Variable Objeto");
		Persona persona = new Persona();
		persona.setNombre("Roberto");
		persona.setEdad(61);
		System.out.println("Inicia en  : " + persona);
		cambioEdad(persona);
		System.out.println("Valor final: " + persona);
		
	}

	private static void cambioEdad(Persona persona) {
		persona.setEdad(40);
		System.out.println("En método  : " + persona);
	}

	private static void cambioNombre(String nombre) {
		nombre = "Anibal";
		System.out.println("En método  : " + nombre);
	}

	private static void duplico(int a) {
		a = a * 2;
		System.out.println("En método  : " + a);
	}

}
