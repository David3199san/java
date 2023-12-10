package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telef1 = new Telefono("claro","098234234",20);
		
		Contacto c1 = new Contacto("Jean Pierre","Sango",telef1,71);
		
		AdminContacto ad = new AdminContacto();
		
		System.out.println("----VALORES INICIALES---------------");
		System.out.println(c1.getNombre());
		System.out.println(c1.getApellido());
		System.out.println(c1.getTelefono().getNumero());
		System.out.println(c1.getTelefono().getOperadora());
		System.out.println("Tiene Whatsapp: "+c1.getTelefono().isTieneWhatspp());
		System.out.println(c1.getPeso());
		
		ad.activarUusario(c1);
		
		System.out.println("----VALORES FINALES---------------");
		System.out.println(c1.getNombre());
		System.out.println(c1.getApellido());
		System.out.println(c1.getTelefono().getNumero());
		System.out.println(c1.getTelefono().getOperadora());
		System.out.println("Tiene Whatsapp: "+c1.getTelefono().isTieneWhatspp());
		System.out.println(c1.getPeso());
		
	}

}
