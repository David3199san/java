package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu = new Calculadora();
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromediar;
		
		resultadoSuma=calcu.sumar(5, 3);
		resultadoResta=calcu.restar(5, 3);
		resultadoMultiplicar=calcu.multiplicar(10, 5);
		resultadoDividir=calcu.dividir(10, 2);
		resultadoPromediar=calcu.promediar(10, 7, 8);
		
		
		System.out.println("El resultado de 5 + 3 es: "+resultadoSuma);
		System.out.println("El resultado de 5 - 3 es: "+resultadoResta);
		System.out.println("El resultado de 10 * 5 es: "+resultadoMultiplicar);
		System.out.println("El resultado de 10/2 es: "+resultadoDividir);
		System.out.println("El promedio de 10, 7, 8 es: "+resultadoPromediar);
	}

}
