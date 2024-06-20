package com.service;

import java.util.List;

import com.model.Factura;

public class GestorFacturas {

	public GestorFacturas() {
		super();
	}

	public double importeTotal(List<Factura> listFacturas) {
		return listFacturas != null ? listFacturas.stream().mapToDouble(f -> f.getTipo().calcular(f.getImporte())).sum() : 0;
	}
	
}
