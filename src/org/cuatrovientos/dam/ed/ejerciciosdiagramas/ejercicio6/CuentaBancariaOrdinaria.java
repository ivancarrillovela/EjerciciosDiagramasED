package org.cuatrovientos.dam.ed.ejerciciosdiagramas.ejercicio6;

public class CuentaBancariaOrdinaria {
	
	private int numero;
	private String titular;
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String depositarDinero(double cantidad) {
		saldo+=cantidad;
		return "Depositados "+cantidad+" euros";
	}
	
	public String retirarDinero(double cantidad) {
		if(cantidad>saldo) {
			return "La cantidad excede el saldo total";
		}
		saldo-=cantidad;
		return "Retirados "+cantidad+" euros";
	}

	public String mostrarInfo() {
		return "CuentaBancariaOrdinaria [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}

}
