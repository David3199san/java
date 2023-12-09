package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante e1 = new Estudiante("Jean Pierre");
		
		e1.calificar(7);
		e1.calificar(8);
		e1.calificar(10);
	}

}
