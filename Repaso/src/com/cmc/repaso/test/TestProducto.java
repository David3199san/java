package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = new Producto("Samsung J6",300);
		
		p1.setPrecio(-312.45);
		//double nuevoPrecio=p1.calcularPrecioPromo(30);
		
		System.out.println("El "+p1.getNombre()+" cuesta $"+p1.getPrecio());
		System.out.println("El "+p1.getNombre()+" con la promo cuesta $"+p1.calcularPrecioPromo(30));
	}

}
