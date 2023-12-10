package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t1 = new Telefono("movi", "098234234", 20);
		Telefono t2 = new Telefono("claro", "098234125", 21);
		Telefono t3 = new Telefono("claro", "098234580", 22);
		Telefono t4 = new Telefono("claro", "098234580", 23);

		AdminTelefono ad1 = new AdminTelefono();

		int conteoClaro = ad1.contarClaro(t1, t2, t3, t4);
		System.out.println("Hay " + conteoClaro + " telefonos con operadora claro");
	}

}
