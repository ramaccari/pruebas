package com.generalidades;

import java.util.Arrays;
import java.util.List;

import com.model.Libro;
import com.model.Telefono;
import com.service.Comprable;

public class TestInterfaceStaticMethod {

	public static void main(String[] args) {
		Libro l1= new Libro ("El señor de los anillos", "Fantasía", 1100, 2000);
		Libro l2= new Libro ("La fundacion", "Ciencia Ficción", 500, 1500);
		Libro l3= new Libro ("El caliz de fuego", "Fantasía", 600, 1800);
		Libro l4= new Libro ("El juego de Ender", "Ciencia Ficción", 500, 600);
		Libro l5= new Libro ("Los pilares de la tierra", "Histórica", 1200, 1800);
		Telefono t1 = new Telefono("iPhone", "Apple", 600000);
		Telefono t2 = new Telefono("One", "Motorola", 200000);
		
		List<Comprable> productos = Arrays.asList(l1, l2, l3, t1, t2, l4, l5);
		
		System.out.println("Total de la compra: " + Comprable.importeTotal(productos));
	}

}
