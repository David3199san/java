package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto1.marca = "Tesla";
		auto1.anio = 2020;
		auto1.precio = 120345.6;
		
		auto2.marca = "BMW";
		auto2.anio = 2019;
		auto2.precio = 130569.6;
		
		System.out.println("-----AUTO 1 ----------");
		System.out.println("marca: "+auto1.marca);
		System.out.println("año: "+auto1.anio);
		System.out.println("precio: "+auto1.precio);
		
		System.out.println("-----AUTO 2 ----------");
		System.out.println("marca: "+auto2.marca);
		System.out.println("año: "+auto2.anio);
		System.out.println("precio: "+auto2.precio);
	}

}
