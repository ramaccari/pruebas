package com.extensibilidad;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.model.Persona;

public class TestFunctionTypes {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Roberto", "Olga", "Ana Luz", "Anabella");
		
		/* Tipo Consummer: Recibe parámetros y no devuelve ningún valor
		forEach de Stream recibe una función del tipo consumer */
		lista.forEach(System.out::println);
		
		/* Tipo Function: Recibe parámetros y retorna un resultadp
		map de Stream recibe una función de tipo Function */
		lista.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
		
		/* Tipo Supplier: No recibe parámetros y retorna un resultadp
		generate de Stream recibe una función de tipo Supplier */
		List<Persona> nuevaLista = Stream.generate(Persona::new)
				.limit(10)
				.peek(p -> p.setEdad(18))
				.collect(Collectors.toList());
		
		// Hemos inicializado una lista de 10 Personas de 18 años
		nuevaLista.forEach(System.out::println);
		
		/* Tipo Predicate: Recibe un parámetro y entrega un resultado de tipo boolean
		filter de stream recibe una función de tipo predicate */
		lista.stream().filter(s -> s.contains("Ana")).forEach(System.out::println);
		
		/* Tipo Operator: Recibe un tipo de parámetro y entrega un resultado dek mismo tipo
		reduce de stream recibe una función de tipo Operator */
		lista.stream().reduce(String::concat).ifPresent(System.out::println);
	}

}
