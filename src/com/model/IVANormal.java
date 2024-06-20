package com.model;

public class IVANormal implements TipoIva {

	@Override
	public double calcular(double importe) {
		return importe * 1.21;
	}

}
