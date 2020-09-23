/*
 * Autore: Vincenzo Santoro
 * Data Creazione: 23/09/2020
 * 
 * 
 */

public class Calcolatrice {
	
	public double somma(double primoNumero, double secondoNumero) {
		return primoNumero+secondoNumero;
	}
	
	public double sottrazione(double primoNumero, double secondoNumero) {
		return primoNumero-secondoNumero;
	}
	
	public double moltiplicazione(double primoNumero, double secondoNumero) {
		return primoNumero*secondoNumero;
	}
	
	public double divisione(double primoNumero, double secondoNumero) throws Exception {
		if(secondoNumero==0)
			throw new Exception("Divisione per 0!");
		return primoNumero/secondoNumero;
	}

}
