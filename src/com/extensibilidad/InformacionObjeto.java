package com.extensibilidad;

import java.lang.reflect.Field;

public interface InformacionObjeto {
	
	default public void imprimirPropiedadesObjeto() {
		System.out.println("La clase " + this.getClass().getName() + " tiene las siguientes propiedades:");
		Field[] campos = this.getClass().getDeclaredFields();
		for (Field field : campos) {
			System.out.println(field.getName());
		}
	}
}
