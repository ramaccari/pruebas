package com.service;

import java.util.List;

public interface Comprable {
	
	public double getPrecio();
	
	public static double importeTotal(List<Comprable> lista) {
		return lista.stream().mapToDouble((c) -> c.getPrecio()).sum();
	}
}
