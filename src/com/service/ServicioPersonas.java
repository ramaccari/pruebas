package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.model.Persona;

public class ServicioPersonas {
	
	private static List<Persona> lista = new ArrayList<Persona>();
	
	static {
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
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
	}

	public Optional<Persona> buscar(String nombre) {
		Optional<Persona> retorno = Optional.empty();
		for (Persona persona : lista) {
			if (persona.getNombre().equals(nombre)) {
				retorno = Optional.of(persona);
			}
		}
		
		return retorno;
	}
}
