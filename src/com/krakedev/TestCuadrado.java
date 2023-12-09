package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado(3);
		Cuadrado c2 = new Cuadrado(6);
		Cuadrado c3 = new Cuadrado(9);
		
	
		
		System.out.println("-----Areas------");
		System.out.println(c1.calcularArea());
		System.out.println(c2.calcularArea());
		System.out.println(c3.calcularArea());
		
		System.out.println("----Perimetro-----");
		System.out.println(c1.calcularPerimetro());
		System.out.println(c2.calcularPerimetro());
		System.out.println(c3.calcularPerimetro());
	}

}
