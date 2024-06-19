package com.collections;

import java.util.ArrayList;
import java.util.Comparator;

import com.model.Persona;

public class TestSort {

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
		
		System.out.println("Lista original");
		lista.forEach(System.out::println);
		
		// Ordeno por edad
		lista.sort(Comparator.comparing(Persona::getEdad));
		System.out.println("Lista ordenada por edad");
		lista.forEach(System.out::println);
	}

}
