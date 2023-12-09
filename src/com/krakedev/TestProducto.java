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
		
		productoA.setNombre("Parasetamol");
		productoA.setDescripcion("Producto generico que alibia cualquier malestar");
		productoA.setPrecio(0.2);
		productoA.setStockActual(100);
		
		productoB.setNombre("Omeprazol");
		productoB.setDescripcion("Reduce la cantidad de ácido producido por el estómago");
		productoB.setPrecio(0.5);
		productoB.setStockActual(50);
		
		productoC.setNombre("Ibuprofeno");
		productoC.setDescripcion("Se utiliza para aliviar el dolor y reducir la inflamación y la fiebre");
		productoC.setPrecio(0.75);
		productoC.setStockActual(25);
		
		System.out.println("------Producto A---------");
		System.out.println("nombre: "+productoA.getNombre());
		System.out.println("nombre: "+productoA.getDescripcion());
		System.out.println("nombre: "+productoA.getPrecio());
		System.out.println("nombre: "+productoA.getStockActual());
		
		System.out.println("------Producto B---------");
		System.out.println("nombre: "+productoB.getNombre());
		System.out.println("nombre: "+productoB.getDescripcion());
		System.out.println("nombre: "+productoB.getPrecio());
		System.out.println("nombre: "+productoB.getStockActual());
		
		System.out.println("------Producto C---------");
		System.out.println("nombre: "+productoC.getNombre());
		System.out.println("nombre: "+productoC.getDescripcion());
		System.out.println("nombre: "+productoC.getPrecio());
		System.out.println("nombre: "+productoC.getStockActual());
		
		
	}

}
