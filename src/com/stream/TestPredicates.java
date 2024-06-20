package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.model.Libro;

public class TestPredicates {

	public static void main(String[] args) {
		Libro l1 = new Libro("El señor de los anillos", "Fantasía", 1100, 2000);
		Libro l2 = new Libro("La fundacion", "Ciencia Ficción", 500, 1500);
		Libro l3 = new Libro("El caliz de fuego", "Fantasía", 600, 1800);
		Libro l4 = new Libro("El juego de Ender", "Ciencia Ficción", 500, 600);
		Libro l5 = new Libro("Los pilares de la tierra", "Histórica", 1200, 1800);
		List<Libro> lista = Arrays.asList(l1, l2, l3, l4, l5);
		
		lista.stream().filter(l -> buenosLibros(l)).forEach(System.out::println); 
	}
	
	public static boolean buenosLibros(Libro libro) {
        Predicate<Libro> p1 = (l -> l.getCategoria().equals("Ciencia Ficción"));
        Predicate<Libro> p2 = (l -> l.getCategoria().equals("Fantasía"));
        Predicate<Libro> p3 = (l -> l.getPaginas() > 1000);
        
        // Ciencia Ficción o Fantasía y con más de 1000 páginas
        Predicate<Libro> ptotal = p1.or(p2).and(p3);
        return ptotal.test(libro);
    }

}
