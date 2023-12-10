package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	public MaquinaDulces() {
		celda1 = new Celda();
		celda2 = new Celda();
		celda3 = new Celda();
		celda4 = new Celda();
	}
	
	public void configurarMaquina(String c1, String c2, String c3, String c4) {
		celda1.setCodigo(c1);
		celda2.setCodigo(c2);
		celda3.setCodigo(c3);
		celda4.setCodigo(c4);
	}
	
	public void mostrarConfiguracion() {
		System.out.println("Codigo de celda1: "+celda1.getCodigo());
		System.out.println("Codigo de celda2: "+celda2.getCodigo());
		System.out.println("Codigo de celda3: "+celda3.getCodigo());
		System.out.println("Codigo de celda4: "+celda4.getCodigo());
		System.out.println("El saldo actual de la maquina es: "+saldo);
	}
	
	public Celda buscarCelda(String codigo) {
		if(celda1.getCodigo()==codigo) {
			return celda1;
		}
		
		if(celda2.getCodigo()==codigo) {
			return celda2;
		}
		
		if(celda3.getCodigo()==codigo) {
			return celda3;
		}
		
		if(celda4.getCodigo()==codigo) {
			return celda4;
		}
		return null;
	}
	
	public void cargarProducto(Producto producto, String codigo, int stock) {
		Celda celdaRecuperada = this.buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, stock);
	}
	
	public void mostrarProductos() {
		System.out.println("-----PRODUCTO CELDA1-----");
		System.out.println("Codigo de celda: "+celda1.getCodigo());
		System.out.println("Stock: "+celda1.getStock());
		if(celda1.getProducto()==null) {
			System.out.println("La celda no tiene productos");
		}else {
			System.out.println("Nombre producto: "+celda1.getProducto().getNombre());
			System.out.println("Precio producto: "+celda1.getProducto().getPrecio());
			System.out.println("Codigo producto: "+celda1.getProducto().getCodigo());
		}
		
		System.out.println("-----PRODUCTO CELDA2-----");
		System.out.println("Codigo de celda: "+celda2.getCodigo());
		System.out.println("Stock: "+celda2.getStock());
		if(celda2.getProducto()==null) {
			System.out.println("La celda no tiene productos");
		}else {
			System.out.println("Nombre producto: "+celda2.getProducto().getNombre());
			System.out.println("Precio producto: "+celda2.getProducto().getPrecio());
			System.out.println("Codigo producto: "+celda2.getProducto().getCodigo());
		}
		
		System.out.println("-----PRODUCTO CELDA3-----");
		System.out.println("Codigo de celda: "+celda3.getCodigo());
		System.out.println("Stock: "+celda3.getStock());
		if(celda3.getProducto()==null) {
			System.out.println("La celda no tiene productos");
		}
		else {
			System.out.println("Nombre producto: "+celda3.getProducto().getNombre());
			System.out.println("Precio producto: "+celda3.getProducto().getPrecio());
			System.out.println("Codigo producto: "+celda3.getProducto().getCodigo());
		}
		
		System.out.println("-----PRODUCTO CELDA4-----");
		System.out.println("Codigo de celda: "+celda4.getCodigo());
		System.out.println("Stock: "+celda4.getStock());
		if(celda4.getProducto()==null) {
			System.out.println("La celda no tiene productos");
		}
		else {
			System.out.println("Nombre producto: "+celda4.getProducto().getNombre());
			System.out.println("Precio producto: "+celda4.getProducto().getPrecio());
			System.out.println("Codigo producto: "+celda4.getProducto().getCodigo());
		}
		System.out.println("-----SALDO DE MAQUINA-----");
		System.out.println(saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigo) {
		if(celda1.getCodigo()==codigo) {
			return celda1.getProducto();
		}
		if(celda2.getCodigo()==codigo) {
			return celda2.getProducto();
		}
		if(celda3.getCodigo()==codigo) {
			return celda3.getProducto();
		}
		if(celda4.getCodigo()==codigo) {
			return celda4.getProducto();
		}
		return null;
	}
	
	public double consultarPrecio(String codigo) {
		if(celda1.getCodigo()==codigo) {
			return celda1.getProducto().getPrecio();
		}
		if(celda2.getCodigo()==codigo) {
			return celda2.getProducto().getPrecio();
		}
		if(celda3.getCodigo()==codigo) {
			return celda3.getProducto().getPrecio();
		}
		if(celda4.getCodigo()==codigo) {
			return celda4.getProducto().getPrecio();
		}
		return 0;
	}
	
	public Celda buscarCeldaProducto(String codigo) {
		if(celda1.getProducto()!=null) {
			if(celda1.getProducto().getCodigo()==codigo || celda1.getProducto()!=null) {
				return celda1;
			}
		}else if(celda2.getProducto()!=null){
			if(celda2.getProducto().getCodigo()==codigo) {
				return celda2;
			}
		}else if(celda3.getProducto()!=null) {
			if(celda3.getProducto().getCodigo()==codigo) {
				return celda3;
			}
		}else if(celda4.getProducto()!=null) {
			if(celda4.getProducto().getCodigo()==codigo) {
				return celda4;
			}
		}
		return null;
	}
	
	public void incrementarProductos(String codigo, int stock) {
		Celda celdaEncontrada = this.buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(stock+celdaEncontrada.getStock());
	}
	
	public void vender(String codigo) {
		Celda ce = this.buscarCelda(codigo);
		ce.setStock(ce.getStock()-1);
		this.saldo+=this.consultarPrecio(codigo);
	}
	
	public double venderConCambio(String codigo, double valorIngresado) {
		Celda ce = this.buscarCelda(codigo);
		this.vender(codigo);
		return valorIngresado-ce.getProducto().getPrecio();
	}

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
