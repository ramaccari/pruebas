package com.stream;

import java.util.TreeMap;

import com.model.Persona;

public class TestForEach {

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
		
		TreeMap<String, Persona> mapa = new TreeMap<String, Persona>();
		mapa.put(p1.getNombre(), p1);
		mapa.put(p2.getNombre(), p2);
		mapa.put(p3.getNombre(), p3);
		mapa.put(p4.getNombre(), p4);
		
		// Es mucho m{as sencillo que hacer un bucle a mano
		mapa.forEach((x, y) -> System.out.println(y));		
	}

}
