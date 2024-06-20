package com.collections;

import java.util.Map;

public class TestMapOf {

	public static void main(String[] args) {
		Map<Integer, String> mapa = Map.of(1, "Roberto", 2, "Olga", 3, "Ana Luz", 4, "Anabella");
		mapa.forEach((x, y) -> System.out.println("Clave: " + x + " Valor: " + y));
	}

}
