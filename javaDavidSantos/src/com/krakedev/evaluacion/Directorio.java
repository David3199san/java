package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public Directorio() {
		contactos = new ArrayList<Contacto>();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
	}

	/*
	public boolean agregarContacto(Contacto contacto) {
		contactos.add(contacto);
		return true;
	}
	 */

	public boolean agregarContacto(Contacto contacto) {
		Contacto con = buscarPorCedula(contacto.getCedula());
		if(con!=null) {
			contactos.add(contacto);
			return false;
		}
		contactos.add(contacto);
		fechaModificacion = new Date();
		return true;
	}

	public Contacto buscarPorCedula(String cedulaContacto) {
		for(int i=0;i<contactos.size();i++) {
			Contacto c = contactos.get(i);
			if(c.getCedula().equals(cedulaContacto)) {
				return c;
			}
		}
		return null;
	}

	public String consultarUltimaModificacion() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return sdf.format(fechaModificacion);
	}

	public int contarPerdidos() {
		int perdidos = 0;
		for(int i=0;i<contactos.size();i++) {
			Contacto c = contactos.get(i);
			if(c.getDireccion()==null) {
				perdidos+=1;
			}
		}
		return perdidos;
	}

	public int contarFijos() {
		int fijos = 0;
		for(int i=0;i<contactos.size();i++) {
			Contacto c = contactos.get(i);
			ArrayList<Telefono> tels = c.getTelefonos();
			for(int j=0;j<tels.size();j++) {
				Telefono tel = tels.get(j);
				if(tel.getTipo().equals("Convencional")&&tel.getEstado().equals("C")) {
					fijos+=1;
				}
			}
		}
		return fijos;
	}
	
	public void depurar() {
		for(int i=0;i<contactos.size();i++) {
			Contacto c = contactos.get(i);
			if(c.getDireccion()==null) {
				incorrectos.add(c);
			}else {
				correctos.add(c);
			}
		}
		contactos.clear();
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
	
	
	

}
