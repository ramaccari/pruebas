package com.datetime;

import java.time.LocalDateTime;

public class TestLocalDateTime {

	public static void main(String[] args) {
		
		// Similar a LocalDat pero con horas, minutos y segundos
		LocalDateTime inicio = LocalDateTime.of(2016, 8, 31, 8, 2, 30);
		LocalDateTime fin = inicio.plusMinutes(25);
		
		System.out.println("Fecha inicial: " + inicio);
		System.out.println("Fecha final  : " + fin);
	}

}
