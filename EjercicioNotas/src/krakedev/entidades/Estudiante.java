package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	
	public Estudiante(String cedula, String nombre, String apellido) {
		notas = new ArrayList<Nota>();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}
	
	public void agregarNota(Nota nuevaNota) {
		if(notas.isEmpty()) {
			if(nuevaNota.getCalificacion()>=0 && nuevaNota.getCalificacion()<=10) {
				notas.add(nuevaNota);
			}else {
				System.out.println("La nota ingresada debe ser mayor o igual a 0 y menor o igual a 10");
			}
		}else {
			for(int i=0;i<notas.size();i++) {
				Nota n = notas.get(i);
				if(!nuevaNota.getMateria().getCodigo().equals(n.getMateria().getCodigo()) && nuevaNota.getCalificacion()>=0 && nuevaNota.getCalificacion()<=10) {
					notas.add(nuevaNota);
				}else if(nuevaNota.getMateria().getCodigo().equals(n.getMateria().getCodigo())) {
					System.out.println("Nota no igresada por duplicidad");
				}else {
					System.out.println("La nota ingresada debe ser mayor o igual a 0 y menor o igual a 10");
				}
			}
		}
	}
	
	public void modificarNota(String codigo, double nuevaNota) {
		boolean codigoEncontrado = false;
		for(int i=0;i<notas.size();i++) {
			Nota n = notas.get(i);
			if(codigo.equals(n.getMateria().getCodigo())) {
				codigoEncontrado=true;
				if(nuevaNota>=0 && nuevaNota<=10) {
					n.setCalificacion(nuevaNota);
					
				}else {
					System.out.println("La nota ingresada debe ser mayor o igual a 0 y menor o igual a 10");
				}	
			}
		}
		
		if(codigoEncontrado==false) {
			System.out.println("No se ha encontrado el codigo");
		}
	}
	
	public double calcularPromedioNotasEstudiante() {
		double suma=0;
		for(int i=0;i<notas.size();i++) {
			Nota n = notas.get(i);
			suma+=n.getCalificacion();
		}
		return suma/notas.size();
	}
	
	public void mostrar() {
		System.out.println("Nombre: "+nombre+" Apellido: "+apellido);
		for(int i=0;i<notas.size();i++) {
			Nota n = notas.get(i);
			System.out.println("Materia: "+n.getMateria().getNombre()+" Nota: "+n.getCalificacion());
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	
}
