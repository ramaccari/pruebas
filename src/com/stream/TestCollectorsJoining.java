package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.model.Persona;

public class TestCollectorsJoining {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Roberto", "Olga", "Ana Luz", "Anabella");
		
		// La clase Persona debe tener un constructor que reciba un String
		List<Persona> personas = lista.stream().map(Persona::new).toList();
		
		// Se quieren todos los nombres entre corchetes y separando cada elemento con una coma
		String nombres = personas.stream().map(Persona::getNombre).collect(Collectors.joining(", ", "(", ")"));
		System.out.println(nombres);
	}

}
