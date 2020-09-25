import java.util.Scanner;

public class MorraCineseMain {

	public static void main(String[] args) {
		
		
		int vittoria = 5;
		int punteggioPC = 0;
		int punteggioGiocatore = 0;
		
		MorraCinese mc = new MorraCinese();
		
		
		while(punteggioPC != vittoria && punteggioGiocatore != vittoria) {
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Inserisci valore");
			
			String valoreUtente = s.next();
			
			
			int risultato = mc.Confronto1(valoreUtente);
			
			if(risultato == 1) {
				punteggioGiocatore++;
				System.out.println("Il giocatore ha vinto!");
			} else if(risultato == -1) {
				punteggioPC++;
				System.out.println("Il computer ha vinto!");
			} else {
				System.out.println("Pareggio!");
			}
			
			
			if(punteggioGiocatore == vittoria) {
				System.out.println("Hai vinto!");
			} else if(punteggioPC == vittoria){
				System.out.println("Hai perso. Il PC vince!");
			} else {
				System.out.println("Gioca ancora");
			}
			
			
			
		}
			
	}

}
