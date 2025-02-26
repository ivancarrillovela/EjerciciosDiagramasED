package org.cuatrovientos.dam.ed.ejerciciosdiagramas.ejercicio4;

import java.util.ArrayList;

public class Lista {
	
	private int id;
	private ArrayList<Producto> productos=new ArrayList<>();
	
	public Lista() {
		super();
	}
	
	public void anadirProducto(Producto producto) {
		productos.add(producto);
	}
	
	public void tacharProducto(Producto producto) {
		productos.remove(producto);
	}

	public String verLista() {
		return "Lista [id=" + id + ", productos=" + productos + "]";
	}
	
}
