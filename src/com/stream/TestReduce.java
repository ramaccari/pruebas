package com.stream;

import java.util.List;

public class TestReduce {

	public static void main(String[] args) {
		List<Integer> lista = List.of(100, 200, 300);
		lista.stream().reduce(Integer::sum).ifPresent(System.out::println);
	}

}
