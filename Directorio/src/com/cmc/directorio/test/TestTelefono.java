package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("movi", "09941234123", 10);

		System.out.println("El telefono es de operadora " + telf.getOperadora() + " cuyo numero es " + telf.getNumero()
				+ " y su codigo es " + telf.getCodigo());
		
	}

}
