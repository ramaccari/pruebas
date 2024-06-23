package com.generalidades;

import com.model.Figura;
import com.model.FigurasFactory;

public class TestSupplier {

	public static void main(String[] args) {
		Figura c = FigurasFactory.crearFigura(Figura.CIRCULO);
		System.out.println("Area del círculo de radio 2 = " + c.area());

		Figura r = FigurasFactory.crearFigura(Figura.RECTANGULO);
		System.out.println("Area del rectángulo de radio 2 = " + r.area());
}

}
