package org.cuatrovientos.dam.ed.ejerciciosdiagramas.ejercicio6;

public class CuentaCorriente {
	
	private CuentaBancariaOrdinaria cuenta;
	private double limiteDescubierto;
	
	
	public CuentaCorriente() {
		super();
		this.limiteDescubierto = 1000;
	}

	public String retirarDinero(double cantidad) {
		if(cantidad>limiteDescubierto) {
			return "El credito se excede del límite";
		}
		limiteDescubierto-=cantidad;
		return "Reitados "+cantidad+" euros, tu limite desciende a "+limiteDescubierto+" euros";
	}

}
