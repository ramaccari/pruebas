package com.stream;

import java.util.Comparator;
import java.util.List;

import com.model.Persona;

public class TestComparator {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setNombre("Roberto");
		p1.setApellido("Maccari");
		p1.setEdad(61);
		Persona p2 = new Persona();
		p2.setNombre("Olga");
		p2.setApellido("Barberan");
		p2.setEdad(57);
		Persona p3 = new Persona();
		p3.setNombre("Ana Luz");
		p3.setApellido("Maccari");
		p3.setEdad(31);
		Persona p4 = new Persona();
		p4.setNombre("Anabella");
		p4.setApellido("Maccari");
		p4.setEdad(27);
		List<Persona> personas = List.of(p1, p2, p3, p4);
		
		// Se crea un comparator por apallido y nombre
		Comparator<Persona> comparator = Comparator.comparing(Persona::getApellido).thenComparing(Persona::getNombre);
		
		// Se utiliza el comparator para ordenar el stream
		personas.stream().sorted(comparator).forEach(System.out::println);
	}

}
