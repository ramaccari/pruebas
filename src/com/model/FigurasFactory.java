package com.model;

import java.util.HashMap;
import java.util.function.Supplier;

public class FigurasFactory {
	
	// El suplier es el constructor que nos interesa tener
	private static HashMap<String, Supplier<Figura>> mapa = new HashMap<String, Supplier<Figura>>();
	static {
		mapa.put(Figura.CIRCULO, Circulo::new);
		mapa.put(Figura.RECTANGULO, Rectangulo::new);
	}

	public static Figura crearFigura(String tipo) {
		// Por defecto devuelve un Rectángulo
		return mapa.get(tipo) != null ? mapa.get(tipo).get() : new Rectangulo();
	}
}
