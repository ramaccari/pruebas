package com.generalidades;

import com.model.TriAtleta;

public class TestSimulaHerenciaMultible {
	
	public static void main(String[] args) {
		TriAtleta ta = new TriAtleta();
		ta.setNombre("Roberto");
		ta.setEdad(61);
		System.out.println(ta);
		ta.pedalea();
		ta.corre();
		ta.nada();
	}
	
}
