package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telef1 = new Telefono("claro","098234234",20);
		Telefono telef2 = new Telefono("claro","098234230",21);
		
		Contacto c1 = new Contacto("Jean Pierre","Sango",telef1,71);
		Contacto c2 = new Contacto("Andres","Pico",telef2,67.8);
		
		AdminContacto ad = new AdminContacto();
		
		Contacto masPesado = ad.buscarMasPesado(c1, c2);
		
		System.out.println("----CONTACTO MAS PESADO---------------");
		System.out.println(masPesado.getNombre());
		System.out.println(masPesado.getApellido());
		System.out.println(masPesado.getTelefono().getNumero());
		System.out.println(masPesado.getTelefono().getOperadora());
		System.out.println(masPesado.getPeso());
		
		boolean operadoras = ad.compararOperadoras(c1, c2);
		if(operadoras==true) {
			System.out.println("--------OPERADORAS---------------");
			System.out.println("Las operadoras son las mismas");
		}else {
			System.out.println("--------OPERADORAS---------------");
			System.out.println("Las operadoras son diferentes");
		}
	}

}
