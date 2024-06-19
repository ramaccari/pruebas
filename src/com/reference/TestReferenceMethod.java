package com.reference;

import java.io.File;

public class TestReferenceMethod {

	public static void main(String[] args) {
		
		//El método isDirectory de File se pasa como parámetro a listFiles
		File[] ficheros = new File(".").listFiles(File::isDirectory);		
		for (File file : ficheros) {
			System.out.println("Nombre: " + file.getName() + " ruta: " + file.getAbsolutePath());
		}
	}

}
