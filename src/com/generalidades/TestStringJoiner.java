package com.generalidades;

import java.util.StringJoiner;

public class TestStringJoiner {

	public static void main(String[] args) {
		String[] array = {"Roberto", "Olga", "Ana Luz", "Anabella"};
		StringJoiner joiner = new StringJoiner(" - ", "[", "]");
		for (String string : array) {
			joiner.add(string);
		}
		System.out.println(joiner);
	}

}
