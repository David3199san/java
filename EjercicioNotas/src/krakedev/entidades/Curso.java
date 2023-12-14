package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		estudiantes = new ArrayList<Estudiante>();
	}
	
	public String buscarEstudiantePorCedula(Estudiante e){
		for(int i=0;i<estudiantes.size();i++) {
			Estudiante es = estudiantes.get(i);
			if(e.getCedula().equals(es.getCedula())) {
				return "El estudiante se encuentra en el curso";
			}
		}
		return null;
	}
	
	public void matricularEstudiante(Estudiante e) {
		if(this.buscarEstudiantePorCedula(e)==null) {
			estudiantes.add(e);
		}
	}
	
	public double calcularPromedioCurso() {
		double suma=0;
		for(int i=0;i<estudiantes.size();i++) {
			Estudiante e = estudiantes.get(i);
			suma=suma+e.calcularPromedioNotasEstudiante();
		}
		return suma/estudiantes.size();
	}
	
	public void mostrar() {
		for(int i=0;i<estudiantes.size();i++) {
			Estudiante e = estudiantes.get(i);
			System.out.println("Apellido: "+e.getApellido()+" Notas: "+e.calcularPromedioNotasEstudiante());
		}
		System.out.println("Promedio del curoso: "+this.calcularPromedioCurso());
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	
}
