import java.util.Scanner;

public class GestioneCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// passando i valori tramite il costruttore --> si ottengono immediatamente quando si
		// istanza l'oggetto
		// cc = new ContoCorrente("Erika Corallo", 1234, 2500);
		ContoCorrente cc;

		Scanner input = new Scanner(System.in);

		System.out.println("Digita nome titolare:");
		String titolare = input.nextLine();

		System.out.println("Digita numero conto:");
		int numero = input.nextInt();

		System.out.println("Digita saldo:");
		double saldo = input.nextDouble();

		cc = new ContoCorrente(titolare, numero, saldo);
		int risposta;

		do {
			System.out.println("Digita 1 per prelievo, 2 per Versamento o 3 per uscire:");
			risposta = input.nextInt();

			if (risposta == 1) {
				System.out.println("Inserisci l'importo da prelevare: ");
				Double importo = input.nextDouble();
				Boolean risultato = cc.controlloSaldo(importo);
				if (risultato == false) {
					System.out.println("il prelievo non è andato a buon fine");
				} else
					cc.prelievo(importo);
			} else if (risposta == 2) {
				System.out.println("Inserisci l'importo da versare: ");
				Double importo = input.nextDouble();
				cc.versamento(importo);
			} else if (risposta == 3) {
				System.out.println("Ciao " + titolare + " stai uscendo!");
			} else {
				System.out.println("Comando non riconosciuto");
			}

			System.out.println("Titolare conto " + cc.getTitolareConto());
			System.out.println("Numero conto " + cc.getNumeroConto());
			System.out.println("Saldo " + cc.getSaldo());
		} while (risposta != 3);

		// cc.setTitolareConto("Erika Corallo");
		// cc.setNumeroConto(1234);
		// cc.setsaldo(2500);
		input.close();

		// String nome;
		// nome = new String("Luisa Rossi");
		// System.out.println(nome.length());

		System.out.println(cc.toString());

	}

}
