package contoCorrente;

import java.util.Scanner;

public class GestioneCC {

	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);
		System.out.print("Inserire Nome e Cognome: ");
		String nomeCognome = tastiera.nextLine();
		System.out.print("Inserire saldo: ");
		double saldo = tastiera.nextDouble();
		System.out.print("Inserire numero conto: ");
		int numeroConto = tastiera.nextInt();

		ContoCorrente cc = new ContoCorrente(nomeCognome, saldo, numeroConto);

		int op;
		do {
			System.out.println("Si vuole effettuare un prelievo (1) o un versamento (2)? \n0 per uscire.");
			op = tastiera.nextInt();
			if (op == 1) {
				System.out.println("Inserire importo da prelevare: ");
				double importo = tastiera.nextDouble();
				if (cc.prelievo(importo))
					System.out.println("Importo maggiore del saldo disponibile. Inserire un importo valido.");
			} else if (op == 2) {
				System.out.println("Inserire importo da versare: ");
				double importo = tastiera.nextDouble();
				cc.versamento(importo);
			} else if (op != 0)
				System.out.println(
						"Comando non accettato. Inserire 1 per il prelievo, 2 per il versamento, 0 per uscire.");

			System.out.println("\n" + cc);
		} while (op != 0);

		tastiera.close();

	}

}
