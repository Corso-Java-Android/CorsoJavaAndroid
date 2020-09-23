/*
 * Autore: Erika Corallo
 * Data di creazione: 23/09/2020
 * 
 * 
 * 
 *
 **/

public class Calcolatrice {

	public int somma(int a, int b) {
		return a + b;
	}

	public double somma(double primoNum, double secondoNum) {
		return primoNum + secondoNum;
	}

	public double sottrazione(double primoNum, double secondoNum) {
		return primoNum - secondoNum;
	}

	public double moltiplicazione(double primoNum, double secondoNum) {
		return primoNum * secondoNum;
	}

	public double divisione(double primoNum, double secondoNum) {
		if (secondoNum != 0) {
			return primoNum / secondoNum;
		} else {
			return primoNum;
		}
	}
}
