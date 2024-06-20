package com.service;

import com.model.Ordenador;

public class OrdenadorUtils {

	public OrdenadorUtils() {
		super();
	}

	public static Ordenador buidFromArray(String[] elementos) {
		return new Ordenador(Integer.parseInt(elementos[0]), elementos[1], Double.parseDouble(elementos[2]));
	}

}
