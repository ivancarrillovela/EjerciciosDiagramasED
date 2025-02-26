package org.cuatrovientos.dam.ed.ejerciciosdiagramas.ejercicio6;

public class CuentaDeAhorro {
	
	private CuentaBancariaOrdinaria cuenta;
	private double interes;
	
	public CuentaDeAhorro() {
		super();
		this.interes = 0.05;
	}

	public String mostrarInfo() {
		return "CuentaDeAhorro [cuenta=" + cuenta + ", interes=" + interes + "]";
	}
	
	public String aplicarInteres() {
		cuenta.depositarDinero(cuenta.getSaldo()*interes);
		return "Interes del "+interes*100+"% aplicado correctamente";
	}
	
}
