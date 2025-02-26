package org.cuatrovientos.dam.ed.ejerciciosdiagramas.ejercicio2;

public class Product {
	
	private String name;
	private int qty;
	private float price;
	
	public Product() {
		super();
	}
	public Product(String name, int qty, double price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", qty=" + qty + ", price=" + price + "]";
	} 
	
	public float total() {
		return qty*price;
	}

}
