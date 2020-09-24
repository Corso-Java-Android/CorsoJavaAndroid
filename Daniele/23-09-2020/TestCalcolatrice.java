package calcolatrice;

import java.util.Scanner;

public class TestCalcolatrice {

	public static void main(String[] args) {
		Calcolatrice calc = new Calcolatrice();

		Scanner tastiera = new Scanner(System.in);

		System.out.println("Inserire primo operando: ");
		double operandoUno = tastiera.nextDouble();

		System.out.println("Inserire secondo operando: ");
		double operandoDue = tastiera.nextDouble();

		System.out.println("La somma è: " + calc.somma(operandoUno, operandoDue));
		System.out.println("La differenza è: " + calc.sottrazione(operandoUno, operandoDue));
		System.out.println("La moltiplicazione è: " + calc.moltiplicazione(operandoUno, operandoDue));
		System.out.println("La divisione è: " + calc.divisione(operandoUno, operandoDue));

		tastiera.close();
	}

}
