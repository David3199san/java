package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto1.setMarca("Tesla");
		auto1.setAnio(2020);
		auto1.setPrecio(120345.6);
		
		auto2.setMarca("BMW");
		auto2.setAnio(2019);
		auto2.setPrecio(130569.6);
		
		System.out.println("-----AUTO 1 ----------");
		System.out.println("marca: "+auto1.getMarca());
		System.out.println("año: "+auto1.getAnio());
		System.out.println("precio: "+auto1.getPrecio());
		
		System.out.println("-----AUTO 2 ----------");
		System.out.println("marca: "+auto2.getMarca());
		System.out.println("año: "+auto2.getAnio());
		System.out.println("precio: "+auto2.getPrecio());
	}

}
