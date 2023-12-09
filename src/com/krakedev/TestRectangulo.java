package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo(3,5);
		Rectangulo r2 = new Rectangulo(9,3);
		
		System.out.println(r1.calcularArea());
		System.out.println(r2.calcularArea());
		System.out.println(r1.calcularPerimetro());
		System.out.println(r2.calcularPerimetro());
		
		r1.setBase(10);
		r1.setAltura(5);
		
		r2.setBase(8);
		r2.setAltura(3);
		
		System.out.println("--------------------");
		System.out.println(r1.calcularArea());
		System.out.println(r2.calcularArea());
		System.out.println(r1.calcularPerimetro());
		System.out.println(r2.calcularPerimetro());
	}

}
