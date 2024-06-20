package com.model;

public interface TipoIva {
	public static final String IVA_NORMAL = "N";
	public static final String IVA_REDUCIDO = "R";

	public double calcular(double importe);
	
}
