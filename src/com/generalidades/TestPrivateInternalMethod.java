package com.generalidades;

import com.model.Impresora;

public class TestPrivateInternalMethod {

	public static void main(String[] args) {
		Impresora tele = new Impresora("XP-211", "Epson", 250000);
		tele.encender();
		tele.imprimir();
		tele.apagar();
	}

}
