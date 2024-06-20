package com.model.factorias;

import com.model.IVANormal;
import com.model.IVAReducido;
import com.model.TipoIva;

public class FactoriaIVA {
	
	public static TipoIva getInstance(String tipo) {
		TipoIva tipoIva;
		switch (tipo) {
		case TipoIva.IVA_REDUCIDO:
			tipoIva = new IVAReducido();
			break;

		case TipoIva.IVA_NORMAL:
			tipoIva = new IVANormal();
			break;

		default:
			tipoIva = new IVANormal();
			break;
		}
		return tipoIva;
	}
	
}
