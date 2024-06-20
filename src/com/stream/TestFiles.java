package com.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.service.OrdenadorUtils;

public class TestFiles {

	public static void main(String[] args) {
		String archivo = "./files/ordenadores.txt";
		
		try {
			// Obtengo todos los ordenadores del archivo
			Stream<String> stream = Files.lines(Paths.get(archivo));
			stream.map(l -> l.split(",")).map(OrdenadorUtils::buidFromArray).forEach(System.out::println);
			stream.close();
		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		}
				
	}

}
