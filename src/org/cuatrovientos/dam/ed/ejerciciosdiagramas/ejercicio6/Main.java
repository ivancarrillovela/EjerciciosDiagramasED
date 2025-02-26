package org.cuatrovientos.dam.ed.ejerciciosdiagramas.ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		crearCuenta("ahorro");
		crearCuenta("corriente");
		crearCuenta("ordinaria");
		
		private String mostrarCuentas();

	}
	
	private static String crearCuenta(String tipoCuenta) {
		switch (tipoCuenta.toUpperCase()) {
		case "ORDINARIA": {
			CuentaBancariaOrdinaria cuenta=new CuentaBancariaOrdinaria();
			return "Cuenta ordinaria creada";
		}
		case "CORRIENTE": {
			CuentaCorriente cuenta=new CuentaCorriente();
			return "Cuenta corriente creada";
		}
		case "AHORRO": {
			CuentaDeAhorro cuenta=new CuentaDeAhorro();
			return "Cuenta de ahorro creada";
		}
		default:
			return "Debes elegir uno de los tipos de cuenta existentes";
		}
	}
	
	private String mostrarCuentas() {
		//Tendria que existir una clase Banco en la que guardaremos una lista con todas las cuentas y las podriamos imprimir llamando a su metodo toString
	}
	
	private String aplicarInteresCuentaAhorro(CuentaDeAhorro cuenta) {
		cuenta.aplicarInteres();
		return "Interes aplicado a las cuentas de ahorro";
	}

}
