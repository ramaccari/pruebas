package com.generalidades;

import com.model.Armario;
import com.model.Mesa;
import com.model.Silla;

public class TestMixins {

	public static void main(String[] args) {
		Armario armario = new Armario();
		System.out.println(armario);
		System.out.println("Armario: No implementa Plegable");
		
		Mesa mesa = new Mesa();
		System.out.println(mesa);
		System.out.print("Mesa: ");
		mesa.plegar();
		
		Silla silla = new Silla();
		System.out.println(silla);
		System.out.print("Silla: ");
		silla.plegar();
	}

}
