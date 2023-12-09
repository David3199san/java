package com.krakedev.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto1 = new Producto(123456,"Baterias");
		
		producto1.setDescripcion("Baterias de larga duracion y amigable con el ambiente");
		producto1.setPeso(2.5);
		
		System.out.println("Codigo del producto: "+producto1.getCodigo());
		System.out.println("Nombre de producto: "+producto1.getNombre());
		System.out.println("Descripcion: "+producto1.getDescripcion());
		System.out.println("Peso del producto: "+producto1.getPeso());
		
	}

}
