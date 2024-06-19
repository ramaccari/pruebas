package com.datetime;

import java.time.LocalDate;
import java.time.Period;

public class TestPeriod {

	public static void main(String[] args) {
		LocalDate fechaA = LocalDate.of(1978, 8, 26);
		LocalDate fechaB = LocalDate.of(1988, 9, 28);

		Period periodo = Period.between(fechaA, fechaB);
		System.out.printf("Entre %s y %s hay %d años, %d meses y %d días", fechaA, fechaB, periodo.getYears(),
				periodo.getMonths(), periodo.getDays());
	}

}
