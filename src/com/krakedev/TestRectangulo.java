package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		r1.base=10;
		r1.altura=5;
		
		r2.base=8;
		r2.altura=3;
		
		System.out.println(r1.calcularArea());
		System.out.println(r2.calcularArea());
		System.out.println(r1.calcularPerimetro());
		System.out.println(r2.calcularPerimetro());
	}

}
