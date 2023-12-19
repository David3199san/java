package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;
	
	public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {
		telefonos = new ArrayList<Telefono>();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}
	
	public void imprimir() {
		System.out.println("Cedula: "+cedula);
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("Direccion: ");
		System.out.println("  Calle Principal: "+direccion.getCallePrincipal());
		System.out.println("  Calle Secundaria: "+direccion.getCalleSecundaria());
	}
	
	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}
	
	public void mostrarTelefonos() {
		System.out.println("Teléfonos con estado 'C': ");
		for(int i=0;i<telefonos.size();i++) {
			Telefono tel = telefonos.get(i);
			if(tel.getEstado().equals("C")) {
				System.out.println("Número: "+tel.getNúmero()+", Tipo: "+tel.getTipo());
			}
		}
	}
	
	public ArrayList<Telefono> recuperarIncorrectos(){
		ArrayList<Telefono> telInco = new ArrayList<Telefono>();
		for(int i=0;i<telefonos.size();i++) {
			Telefono tel = telefonos.get(i);
			if(tel.getEstado().equals("E")) {
				telInco.add(tel);
			}
		}
		return telInco;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	
	
}
