package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu = new Calculadora();
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicar;
		
		resultadoSuma=calcu.sumar(5, 3);
		resultadoResta=calcu.restar(5, 3);
		resultadoMultiplicar=calcu.multiplicar(10, 5);
		
		
		System.out.println("El resultado de 5 + 3 es: "+resultadoSuma);
		System.out.println("El resultado de 5 - 3 es: "+resultadoResta);
		System.out.println("El resultado de 10 * 5 es: "+resultadoMultiplicar);
	}

}
