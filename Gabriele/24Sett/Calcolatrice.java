
	/*
	 * Autore: Gabriele Lo Piccolo
	 * Data Creazione: 23/09/2020
	 * 
	 * 
	 */

public class Calcolatrice {
	
	
	

	public int somma(int a, int b) {
		return a + b;
	}
	
	public double somma(double primoNumero, double secondoNumero) {
		return primoNumero + secondoNumero;
	}
	
	public double sottrazione(double primoNumero, double secondoNumero) {
		return primoNumero - secondoNumero;
	}
	
	public double moltiplicazine(double primoNumero, double secondoNumero) {
		return primoNumero * secondoNumero;
	}
	
	public double divisione(double primoNumero, double secondoNumero) {
		
		if(secondoNumero != 0) {
			return primoNumero/secondoNumero;
		} else {
			return 0.0;
		}
		
		
	}
	
	
}
