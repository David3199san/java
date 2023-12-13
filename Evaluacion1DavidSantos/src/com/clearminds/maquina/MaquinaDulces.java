package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	
	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}
	
	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}
	
	public void mostrarConfiguracion() {
		for(int i=0;i<celdas.size();i++) {
			Celda c = celdas.get(i);
			System.out.println("Celda: "+c.getCodigo());
		}
	}
	
	public Celda buscarCelda(String codigoCelda) {
		Celda c = null;
		for(int i=0;i<celdas.size();i++) {
			Celda elem = celdas.get(i);
			if(codigoCelda.equals(elem.getCodigo())) {
				return c=elem;
			}
		}
		return c;
	}
	
	public void cargarProducto(Producto p, String codigoCelda, int items) {
		Celda celdaRecuperada=this.buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(p, items);
	}
	
	public void mostrarProductos() {
		for(int i=0;i<celdas.size();i++) {
			Celda c = celdas.get(i);
			if(c.getProducto()!=null) {
				System.out.println("Celda: "+c.getCodigo()+" Stock: "+c.getStock()+" Producto: "+c.getProducto().getNombre()+" Precio: "+c.getProducto().getPrecio());
			}else {
				System.out.println("Celd: "+c.getCodigo()+" Stock: "+c.getStock()+" Sin producto asignado");
			}
		}
		System.out.println("Saldo: "+saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigoCelda) {
		for(int i=0;i<celdas.size();i++) {
			Celda c = celdas.get(i);
			if(codigoCelda.equals(c.getCodigo())) {
				return c.getProducto();
			}
		}
		return null;
	}
	
	public double consultarPrecio(String codigoCelda) {
		for(int i=0;i<celdas.size();i++) {
			Celda c = celdas.get(i);
			if(codigoCelda.equals(c.getCodigo())) {
				return c.getProducto().getPrecio();
			}
		}
		return 0;
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		for(int i=0;i<celdas.size();i++) {
			Celda c = celdas.get(i);
			if(c.getProducto()!=null) {
				if(codigoProducto.equals(c.getProducto().getCodigo())){
					return c;
				}
			}
		}
		return null;
	}
	
	public void incrementarProductos(String codigoProducto, int items) {
		Celda celdaEncontrada =this.buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(celdaEncontrada.getStock()+items);
	}
	
	public void vender(String codigoCelda) {
		Celda ce = this.buscarCelda(codigoCelda);
		ce.setStock(ce.getStock()-1);
		this.saldo+=ce.getProducto().getPrecio();
	}
	
	public double venderConCambio(String codigoCelda, double valor) {
		Celda ce = this.buscarCelda(codigoCelda);
		ce.setStock(ce.getStock()-1);
		this.saldo+=ce.getProducto().getPrecio();
		return valor-ce.getProducto().getPrecio();
		
	}
	
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> pMenores = new ArrayList<Producto>();
		for(int i=0;i<celdas.size();i++) {
			Celda ce = celdas.get(i);
			if(ce.getProducto()!=null) {
				if(ce.getProducto().getPrecio()<=limite) {
					pMenores.add(ce.getProducto());
				}
			}
		}
		return pMenores;
	}
	
	public void imprimirMenores(ArrayList<Producto> p) {
		System.out.println("Productos Menores: "+p.size());
		for(int i=0;i<p.size();i++) {
			Producto pro = p.get(i);
			System.out.println("Nombre: "+pro.getNombre()+" Precio: "+pro.getPrecio());
		}
	}

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
