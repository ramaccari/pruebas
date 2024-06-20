package com.collections;

import java.util.ArrayList;

import com.model.Persona;

public class TestRemuveIf {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setNombre("Roberto");
		p1.setEdad(61);
		Persona p2 = new Persona();
		p2.setNombre("Olga");
		p2.setEdad(57);
		Persona p3 = new Persona();
		p3.setNombre("Ana Luz");
		p3.setEdad(31);
		Persona p4 = new Persona();
		p4.setNombre("Anabella");
		p4.setEdad(27);
		
		ArrayList<Persona> lista = new ArrayList<>(4);
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		
		System.out.println("Lista completa");
		lista.forEach(System.out::println);
		
		// Elimino los mayores a 50 años
		lista.removeIf(p -> p.getEdad() >= 50);
		System.out.println("Solo los menores de 50 años");
		lista.forEach(System.out::println);
	}

}
