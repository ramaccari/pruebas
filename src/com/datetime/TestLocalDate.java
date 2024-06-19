package com.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;

public class TestLocalDate {

	public static void main(String[] args) {
		
		// Utilisada para instanciar una fecha concreta en el calendario
		LocalDate hoy = LocalDate.now();
		LocalDate finAño = LocalDate.of(hoy.get(ChronoField.YEAR), 12, 31);
		
		LocalDate navidad = finAño.minusDays(6);
		
		System.out.println("La navidad es el: " + navidad.getDayOfMonth() + " del " + navidad.getMonthValue());
		
		LocalDate nextNavidad;
		if (hoy.isBefore(navidad)) {
			nextNavidad = LocalDate.of(hoy.get(ChronoField.YEAR), 12, 25);
		} else {
			nextNavidad = LocalDate.of(hoy.get(ChronoField.YEAR) + 1, 12, 25);
		}
		Period p = Period.between(hoy, nextNavidad);
		
		System.out.println("Faltan " + p.getMonths() + " meses y " + p.getDays() + " días para la próxima navidad");
	}

}
