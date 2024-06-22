package com.collections;

import java.util.HashMap;
import java.util.Map;

import com.model.Documento;

public class TestComputeIfAbsent {

	private static Map<String, Documento> cache = new HashMap<String, Documento>();

	public static void main(String[] args) {
		cargarCache();
		String tipo = "javaee";
		String contenido = "javaee es una plataflrma de desarrollo";
		
		// Solo se ejecuta si javaee no está en cache
		cache.computeIfAbsent(tipo, k -> new Documento(tipo, contenido));
		
		Documento otro = cache.get(tipo);
		if (otro != null) {
			System.out.println("Encontrado en el caché: " + otro);
		}
	}

	public static Map<String, Documento> cargarCache() {
	    cache.put("java", new Documento("java", "java es un lenguaje de programación"));
	    cache.put("php", new Documento("php", "php nos programa la web"));
	    cache.put("javascript", new Documento("javascript", "es un lenguaje sencillo"));
	    cache.put("word", new Documento("word", "word es un editor de texto"));
	    cache.put("eclipse", new Documento("excel", "excel es un generador de hojas de cálculo"));
	    return cache;
	}

}
