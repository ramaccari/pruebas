package com.generalidades;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestFilesWalf {

	public static void main(String[] args) {
		
		// Recorre el directorio indicado todos los subdirectorios
		try (Stream<Path> stream = Files.walk(Paths.get("./src"))) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

}
