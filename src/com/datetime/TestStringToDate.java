package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestStringToDate {

	public static void main(String[] args) {
		
		// Formato por defecto LocalDate
		LocalDate fecha = LocalDate.parse("2020-06-10");
		System.out.println("Día del mes: " + fecha.getDayOfMonth());
		System.out.println("Mes del año: " + fecha.getMonthValue());
		System.out.println("Año seteado: " + fecha.getYear());
		
		// Formato por defecto LocalTime
		LocalTime tiempo = LocalTime.parse("15:15:44");
		System.out.println("Hora seteada: " + tiempo.getHour());
		System.out.println("Minuto setead: " + tiempo.getMinute());
		System.out.println("Segundo seteado: " + tiempo.getSecond());
		
		// Foramto por defecto LocalDateTime
		LocalDateTime fullDate = LocalDateTime.parse("2024-06-22T15:19:30");
		System.out.println("Día del mes: " + fullDate.getDayOfMonth());
		System.out.println("Mes del año: " + fullDate.getMonthValue());
		System.out.println("Año seteado: " + fullDate.getYear());
		System.out.println("Hora del día: " + fullDate.getHour());
		System.out.println("Minuto de la hora: " + fullDate.getMinute());
		System.out.println("Segundo del minuto: " + fullDate.getSecond());
		
		// Utilizando un DateTimeFormatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		fullDate = LocalDateTime.parse("27/01/1963 12:25", formatter);
		System.out.println("Día del mes: " + fullDate.getDayOfMonth());
		System.out.println("Mes del año: " + fullDate.getMonthValue());
		System.out.println("Año seteado: " + fullDate.getYear());
		System.out.println("Hora del día: " + fullDate.getHour());
		System.out.println("Minuto de la hora: " + fullDate.getMinute());
		System.out.println("Segundo del minuto: " + fullDate.getSecond());
		
		DateTimeFormatter output = DateTimeFormatter.ofPattern("EEEE-MMMM-yyyy HH:mm");
		System.out.println("Fecha formateada: " + output.format(fullDate));
	}

}
