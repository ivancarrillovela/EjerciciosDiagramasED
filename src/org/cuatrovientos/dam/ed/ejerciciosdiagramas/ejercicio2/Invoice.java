package org.cuatrovientos.dam.ed.ejerciciosdiagramas.ejercicio2;

import java.util.ArrayList;

public class Invoice {

	private String customer;
	private ArrayList<Product> products= new ArrayList<>();
	
	public Invoice(String customer) {
		super();
		this.customer = customer;
	}
	
	public void add(Product product) {
		products.add(product);
	}
	
	public void remove(int numLista) {
		products.remove(numLista);
	}
	
	public float total(){
		float precioTotal = 0;
		for (Product p:products){
			precioTotal+=p.total();
		}
		return precioTotal;
	}
}
