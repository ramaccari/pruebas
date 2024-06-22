package com.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.model.Persona;

public class TestPartition {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setNombre("Roberto");
		p1.setEdad(61);
		Persona p2 = new Persona();
		p2.setNombre("Olga");
		p2.setEdad(57);
		Persona p3 = new Persona();
		p3.setNombre("Ana Luz");
		p3.setEdad(31);
		Persona p4 = new Persona();
		p4.setNombre("Anabella");
		p4.setEdad(27);
		Persona p5 = new Persona();
		p5.setNombre("Pedro");
		p5.setEdad(20);
		Persona p6 = new Persona();
		p6.setNombre("María");
		p6.setEdad(50);
		Persona p7= new Persona();
		p7.setNombre("Gema");
		p7.setEdad(68);
		Persona p8 = new Persona();
		p8.setNombre("David");
		p8.setEdad(75);
		Persona p9 = new Persona();
		p9.setNombre("Mar");
		p9.setEdad(70);
		List<Persona> todos = List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9);
		
		// Se optiene un map con dos listas de Personas (una para la condición verdadera y otra para la falsa)
		Map<Boolean, List<Persona>> particion = todos.stream().collect(Collectors.partitioningBy(Persona::estaJubilada)); 
		particion.get(Boolean.TRUE).stream().forEach(p -> System.out.println(p + " No paga los medicamentos"));
		particion.get(Boolean.FALSE).stream().forEach(p -> System.out.println(p + " Debe pagar los medicamentos"));
	}

}
