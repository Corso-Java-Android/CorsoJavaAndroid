import java.util.Scanner;

public class GestioneCC {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Inserisci il nome del titolare: ");
		String titolareConto = input.nextLine();
		System.out.println("Inserisci il numero del conto: ");
		int numeroConto = input.nextInt();
		System.out.println("Inserisci il saldo del conto: ");
		double saldo = input.nextDouble();
		
		ContoCorrente cc=new ContoCorrente(titolareConto, numeroConto, saldo);
		int risposta;
		
		do {
		System.out.println("Digita 1 per Prelievo o 2 per Versamento");
		risposta = input.nextInt();
		
		if(risposta == 1) {
			System.out.println("Inserisci l'importo da prelevare: ");
			Double importo = input.nextDouble();
			Boolean risultato = cc.controlloSaldo(importo);
			
			if(risultato==false) {
				System.out.println("Il prelievo non è andato a buon fine per mancanza di fondi");
			}else cc.prelievo(importo);
		}else if(risposta ==2) {
			System.out.println("Inserisci l'importo da versare: ");
			Double importo=input.nextDouble();
			cc.versamento(importo);
		}else {
			System.out.println("Comando non riconosciuto");
		}
		
		System.out.println("Titolare: " + cc.getTitolareConto());
		System.out.println("Numero Conto: " + cc.getNumeroConto());
		System.out.println("Saldo: " + cc.getSaldo());

			
		}while(risposta!=3);
		
		System.out.println(cc);
		input.close();
		
	}

}
