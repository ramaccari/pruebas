package com.lamda;

import java.util.Arrays;
import java.util.List;

public class TestParalell {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(100, 200, 300, 100, 500, 200, 300, 100, 500, 200, 300, 100, 500);
		
		// Ejecución en paralelo
		Double total = lista.stream().parallel().filter(elemento -> elemento > 200).mapToDouble(elemento -> elemento * 1.21).sum();
		
		System.out.println(total);
	}

}
