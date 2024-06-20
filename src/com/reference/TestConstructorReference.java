package com.reference;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.model.Persona;

public class TestConstructorReference {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Roberto", "Olga", "Ana Luz", "Anabella");
		
		// La clase Persona debe tener un constructor que reciba un String
		List<Persona> personas = lista.stream().map(Persona::new).toList();
		personas.forEach(p -> System.out.println(p));
		
		List<String> nombresArchivo = Arrays.asList("./files/prueba.txt", "./files/algo.txt", "./files/borrar.txt");

		// Se puede usar para crear varios archivos
		nombresArchivo.stream().map(File::new).forEach(f -> {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		});
	}

}
