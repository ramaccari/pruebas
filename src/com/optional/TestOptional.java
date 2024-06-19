package com.optional;

import java.util.Optional;

import com.model.Persona;
import com.service.ServicioPersonas;

public class TestOptional {

	public static void main(String[] args) {
		String busca = "Emma";
        ServicioPersonas sp = new ServicioPersonas();
        Optional<Persona> op = sp.buscar(busca);
        if (op.isPresent()) {
			System.out.println("Persona encontrada = " + op.get());
		} else {
			System.out.println("El nombre " + busca + " no fué encontrado");
		}
        
        busca = "Roberto";
        op = sp.buscar(busca);
        if (op.isPresent()) {
			System.out.println("Persona encontrada = " + op.get());
		} else {
			System.out.println("El nombre " + busca + " no fué encontrado");
		}
        
	}
	

}
