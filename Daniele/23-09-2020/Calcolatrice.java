package calcolatrice;

import java.lang.System;

public class Calcolatrice {

	public double somma(double operandoUno, double operandoDue) {
		return operandoUno + operandoDue;
	}

	public double sottrazione(double operandoUno, double operandoDue) {
		return operandoUno - operandoDue;
	}

	public double moltiplicazione(double operandoUno, double operandoDue) {
		return operandoUno * operandoDue;
	}

	public double divisione(double operandoUno, double operandoDue) {
		if (operandoDue == 0) {
			System.out.print("Divisione per zero! ");
			return -1;
		} else {
			return operandoUno / operandoDue;
		}

	}

}
