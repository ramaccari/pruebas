package com.generalidades;

import java.util.Arrays;
import java.util.List;

import com.model.Factura;
import com.model.IVAFactory;
import com.model.TipoIva;
import com.service.GestorFacturas;

public class TestPatronFactoria {

	public static void main(String[] args) {
		Factura f1 = new Factura(1111, 100, IVAFactory.getInstance(TipoIva.IVA_NORMAL));
		Factura f2 = new Factura(1112, 100, IVAFactory.getInstance(TipoIva.IVA_REDUCIDO));
		Factura f3 = new Factura(1112, 100, IVAFactory.getInstance(TipoIva.IVA_NORMAL));
		Factura f4 = new Factura(1112, 100, IVAFactory.getInstance(TipoIva.IVA_REDUCIDO));
		List<Factura> compra = Arrays.asList(f1, f2, f3, f4);
		GestorFacturas gf = new GestorFacturas();
		
		System.out.println("Total de la compra = " + gf.importeTotal(compra));
		
	}

}
