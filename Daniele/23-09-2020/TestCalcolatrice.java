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

		System.out.println("La somma �: " + calc.somma(operandoUno, operandoDue));
		System.out.println("La differenza �: " + calc.sottrazione(operandoUno, operandoDue));
		System.out.println("La moltiplicazione �: " + calc.moltiplicazione(operandoUno, operandoDue));
		System.out.println("La divisione �: " + calc.divisione(operandoUno, operandoDue));

		tastiera.close();
	}

}
