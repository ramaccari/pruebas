package com.stream;

import java.util.List;

import com.model.Aerolinea;
import com.model.Viaje;

public class TestFlatMap {

	public static void main(String[] args) {
		Viaje arg = new Viaje("Argentina");
		Viaje ing = new Viaje("Inglaterra");
		Viaje esp = new Viaje("España");
		Viaje eeuu = new Viaje("EEUU");
		Viaje fra = new Viaje("Francia");
		Viaje ita = new Viaje("Italia");
		Aerolinea aa = new Aerolinea("Aerolineas Argentinas");
		aa.addViaje(arg);
		aa.addViaje(eeuu);
		aa.addViaje(fra);
		Aerolinea ai = new Aerolinea("Alitalia");
		ai.addViaje(ita);
		ai.addViaje(esp);
		ai.addViaje(fra);
		Aerolinea ap = new Aerolinea("Panam");
		ap.addViaje(ing);
		ap.addViaje(eeuu);
		
		List<Aerolinea> lista = List.of(aa, ai, ap);
		lista.forEach(System.out::println);
		
		// Si solo me interesan los viajes uso FlatMap
		lista.stream().map(a -> a.getViajes()).flatMap(v -> v.stream()).distinct().forEach(System.out::println);
	}

}
