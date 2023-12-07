package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();
		
		productoA.nombre="Parasetamol";
		productoA.descripcion="Producto generico que alibia cualquier malestar";
		productoA.precio=0.2;
		productoA.stockActual=100;
		
		productoB.nombre="Omeprazol";
		productoB.descripcion="Reduce la cantidad de ácido producido por el estómago";
		productoB.precio=0.5;
		productoB.stockActual=50;
		
		productoC.nombre="Ibuprofeno";
		productoC.descripcion="Se utiliza para aliviar el dolor y reducir la inflamación y la fiebre";
		productoC.precio=0.75;
		productoC.stockActual=25;
		
		System.out.println("------Producto A---------");
		System.out.println("nombre: "+productoA.nombre);
		System.out.println("nombre: "+productoA.descripcion);
		System.out.println("nombre: "+productoA.precio);
		System.out.println("nombre: "+productoA.stockActual);
		
		System.out.println("------Producto B---------");
		System.out.println("nombre: "+productoB.nombre);
		System.out.println("nombre: "+productoB.descripcion);
		System.out.println("nombre: "+productoB.precio);
		System.out.println("nombre: "+productoB.stockActual);
		
		System.out.println("------Producto C---------");
		System.out.println("nombre: "+productoC.nombre);
		System.out.println("nombre: "+productoC.descripcion);
		System.out.println("nombre: "+productoC.precio);
		System.out.println("nombre: "+productoC.stockActual);
		
		
	}

}
