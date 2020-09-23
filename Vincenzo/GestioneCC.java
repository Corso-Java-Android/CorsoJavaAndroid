import java.util.Scanner;

public class GestioneCC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il nome del titolare: ");
		String titolare = input.nextLine();
		System.out.print("Inserisci il numero del conto: ");
		int numero = input.nextInt();
		System.out.print("Inserisci il saldo del conto: ");
		Double saldo = input.nextDouble();
		ContoCorrente cc = new ContoCorrente(titolare, numero, saldo);
		int risposta;
		
		do{
			System.out.print("Digita 1 per Prelievo, 2 per Versamento, 3 per uscire: ");
			risposta = input.nextInt();

			if(risposta==1) {
				System.out.print("Inserisci l'importo da prelevare: ");
				Double importo = input.nextDouble();
				Boolean risultato = cc.controlloSaldo(importo);
				if(risultato==false){
					System.out.println("Il prelievo non è andato a buon fine per mancanza di fondi!");
				}else cc.prelievo(importo);
			}else if(risposta==2) {
				System.out.print("Inserisci l'importo da versare: ");
				Double importo = input.nextDouble();
				cc.versamento(importo);
			}else if(risposta==3){
				System.out.println("Ciao "+titolare+" stai uscendo!");
			}else {
				System.out.println("Comando non riconosciuto!");
			}
			System.out.println("Titolare conto: " + cc.getTitolareConto());
			System.out.println("Numero conto: " + cc.getNumeroConto());
			System.out.println("Saldo: "+cc.getSaldo());
		}while(risposta!=3);

		System.out.println(cc);
		input.close();
	}

}
