
public class PartitaMorra {

	public static void main(String[] args) {
		int vittoria = 5;
		int punteggioPC = 0;
		int punteggioGiocatore = 0;
		
		MorraCinese morra = new MorraCinese();
		MetodiAusiliari.apriScanner();
		
		while (punteggioGiocatore!=vittoria && punteggioPC!=vittoria) {
			System.out.println("Inserisci la tua mossa");
			int risultato = morra.confronto(MetodiAusiliari.inputStringa());
			if(risultato==1) 
				punteggioGiocatore++;
			else if(risultato==-1)
				punteggioPC++;
			System.out.println("Punteggio utente: " + punteggioGiocatore);
			System.out.println("Punteggio PC: " + punteggioPC);
					
		}
		
		if(punteggioGiocatore==vittoria)
			System.out.println("Hai vinto la partita!");
		else System.out.println(("Hai perso la partita!"));
		
		MetodiAusiliari.chiudiScanner();

	}

}
