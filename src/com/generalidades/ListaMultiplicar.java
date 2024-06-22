package com.generalidades;

import java.util.Iterator;

public class ListaMultiplicar implements Iterable<Integer> {

	private int posicion;
    private int size;
    private int numero;
    
	public ListaMultiplicar(int numero, int size) {
		super();
		this.size = size;
		this.numero = numero;
	}

	@Override
	public Iterator<Integer> iterator() {
		int size = this.size;
		Iterator<Integer> i = new Iterator<Integer>() {
			
			@Override
			public Integer next() {
				return numero * posicion++;
			}
			
			@Override
			public boolean hasNext() {
				return posicion < size ? true : false;
			}
		};
		
		return i;
	}

}