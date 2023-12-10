package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telf) {
		if(telf.getOperadora()=="movi") {
			telf.setTieneWhatspp(true);
		}
	}
	
	public int contarMovi(Telefono t1, Telefono t2, Telefono t3) {
		int suma =0;
		if(t1.getOperadora()=="movi") {
			suma +=1;
		}
		if(t2.getOperadora()=="movi") {
			suma +=1;
		}
		if(t3.getOperadora()=="movi") {
			suma +=1;
		}
		return suma;
	}
	
	public int contarClaro(Telefono t1, Telefono t2, Telefono t3, Telefono t4) {
		int suma =0;
		if(t1.getOperadora()=="claro") {
			suma +=1;
		}
		if(t2.getOperadora()=="claro") {
			suma +=1;
		}
		if(t3.getOperadora()=="claro") {
			suma +=1;
		}
		if(t4.getOperadora()=="claro") {
			suma +=1;
		}
		return suma;
	}
}
