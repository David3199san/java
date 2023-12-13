package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TesBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A"));
		maquina.agregarCelda(new Celda("B"));
		maquina.agregarCelda(new Celda("C"));
		maquina.agregarCelda(new Celda("D"));
		maquina.agregarCelda(new Celda("E"));
		maquina.agregarCelda(new Celda("F"));
		
		Producto productoA = new Producto("KE34", "Papitas", 0.85);
		Producto productoB = new Producto("BDCR", "Galletas", 2.54);
		Producto productoC = new Producto("BDCR1", "Cola", 1.5);
		Producto productoD = new Producto("BDCR2", "Kchitos", 0.35);
		Producto productoE = new Producto("BDCR3", "Chocolate", 0.5);
		Producto productoF = new Producto("BDCR4", "V220", 1.00);
		
		maquina.cargarProducto(productoA, "A", 2);
		maquina.cargarProducto(productoB, "B", 3);
		maquina.cargarProducto(productoC, "C", 4);
		maquina.cargarProducto(productoD, "D", 5);
		maquina.cargarProducto(productoE, "E", 6);
		maquina.cargarProducto(productoF, "F", 7);
		
		ArrayList<Producto> pdts = maquina.buscarMenores(1);
		
		maquina.imprimirMenores(pdts);
		
		
	}

}
