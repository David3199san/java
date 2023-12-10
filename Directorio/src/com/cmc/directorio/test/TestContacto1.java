package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telef = new Telefono("cnt","098234234",20);
		Contacto c = new Contacto("Jean Pierre","Sango",telef,67.8);
		
		System.out.println(c.getNombre());
		System.out.println(c.getApellido());
		System.out.println(c.getTelefono().getNumero());
		System.out.println(c.getTelefono().getOperadora());
		System.out.println(c.getPeso());
	}

}
