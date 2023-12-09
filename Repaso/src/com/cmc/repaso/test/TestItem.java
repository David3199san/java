package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i1 = new Item();
		
		i1.setNombre("Papas");
		i1.setProductosActuales(20);
		i1.imprimir();
		
		i1.vender(2);
		i1.imprimir();
		
		i1.devolver(1);
		i1.imprimir();
	}

}
