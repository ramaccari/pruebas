package com.generalidades;

import com.model.Figura;
import com.model.factorias.FactoriaFiguras;

public class TestSupplier {

	public static void main(String[] args) {
		Figura c = FactoriaFiguras.crearFigura(Figura.CIRCULO);
		System.out.println("Area del círculo de radio 2 = " + c.area());

		Figura r = FactoriaFiguras.crearFigura(Figura.RECTANGULO);
		System.out.println("Area del rectángulo de radio 2 = " + r.area());
}

}
