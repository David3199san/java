package com.cmc.repaso.entidades;

public class Validacion {
	public boolean validarMonto(double monto) {
		if(monto>0) {
			System.out.println("true");
			return true;
		}else {
			System.out.println("false");
			return false;
		}
	}
}
