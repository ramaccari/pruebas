package com.generalidades;

public class TestClaseIterable {

	public static void main(String[] args) {
		int raiz = 7;
		int longitud = 10;
		ListaMultiplicar lista = new ListaMultiplicar(raiz, longitud);
		System.out.println("tabla del " + raiz + " del 0 al " + (longitud - 1));
		lista.forEach(System.out::println);
	}

}
