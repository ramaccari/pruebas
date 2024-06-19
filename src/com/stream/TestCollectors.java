package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.model.Libro;

public class TestCollectors {

	public static void main(String[] args) {
		Libro l1= new Libro ("El señor de los anillos", 1000);
		Libro l2= new Libro ("La fundacion", 500);
		Libro l3= new Libro ("El caliz de fuego", 600);
		List<Libro> libros = new ArrayList<Libro>();
		libros.add(l1);
		libros.add(l2);
		libros.add(l3);
		
		// Se define un Supplier de Stream de libros
		System.out.println("Como Stream");
		Supplier<List<Libro>> sup = () -> libros;
		sup.get().forEach(l -> System.out.println(l.getTitulo()));
		
		// Se convierte a un Array
		System.out.println("Como Array");
		Libro[] arrayLibro = sup.get().toArray(Libro[]::new);
		for (Libro libro : arrayLibro) {
			System.out.println(libro.getTitulo() + " - " + libro.getPaginas());
		}
		
		// Se convierte a una lista
		System.out.println("Como List");
		List<Libro> listaLibros = sup.get().stream().collect(Collectors.toList());
		listaLibros.forEach(l -> System.out.println(l));
		
		// Se convierte en un set
		System.out.println("Como Set");
		Set<Libro> setLibros = sup.get().stream().collect(Collectors.toSet());
		setLibros.forEach(l -> System.out.println(l));
		
		// Juntando todos los t´tulos de los libros
		System.out.println("Todos los títulos juntos");
		String todos = sup.get().stream().map((l) -> l.getTitulo()).collect(Collectors.joining(" - "));
		System.out.println(todos);
		
		// Sumando todas las páginas
		Optional<Integer> paginas = sup.get().stream().map((l) -> l.getPaginas()).collect(Collectors.reducing(Integer::sum));
		if (paginas.isPresent()) {
			System.out.println("Total de pagínas = " + paginas.get());
		}
	}

}
