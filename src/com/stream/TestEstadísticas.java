package com.stream;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

import com.model.Persona;

public class TestEstadísticas {

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
		List<Persona> personas = Arrays.asList(p1, p2, p3, p4);
		
		int sumaEdeades = personas.stream().mapToInt(Persona::getEdad).sum();
		System.out.println("La suma de todas las edades es: " + sumaEdeades);
		
		System.out.print("El promedio de esdad es: ");
		personas.stream().mapToDouble(Persona::getEdad).average().ifPresent(System.out::println);
		
		System.out.print("La edad máxima es: ");
		personas.stream().mapToInt(Persona::getEdad).max().ifPresent(System.out::println);

		System.out.print("La edad mínima es: ");
		personas.stream().mapToInt(Persona::getEdad).min().ifPresent(System.out::println);
		
		// Para acceder a todas las estadísticas juntas
		DoubleSummaryStatistics estadisticas = personas.stream().mapToDouble(Persona::getEdad).summaryStatistics();
		System.out.println("Personas: " + estadisticas.getCount() + 
							" Edad promedio: " + estadisticas.getAverage() + 
							" Edad máxima: " + estadisticas.getMax() + 
							" Edad mínima: " + estadisticas.getMin() + 
							" Suma de edades: " + estadisticas.getSum());
	}

}
