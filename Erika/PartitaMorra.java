package esercizi24sep;

import java.util.*;
import java.util.Scanner;

public class PartitaMorra {

	public static void main(String[] args) {
		int vittoria = 5;
		int punteggioPC = 0;
		int punteggioGiocatore = 0;
		MorraCinese morra = new MorraCinese();
		
		MetodiAusiliari.apriScanner();
		while(punteggioGiocatore!=vittoria && punteggioPC!=vittoria) {
			System.out.println("Punteggio PC: "+punteggioPC+". Punteggio giocatore: "+punteggioGiocatore);
			int risultato = morra.confronto(MetodiAusiliari.inputStringa("Sasso, Carta o Forbici? "));
			if(risultato==1)
				punteggioGiocatore++;
			else if(risultato==-1)
				punteggioPC++;
		}
		MetodiAusiliari.chiudiScanner();
		if(punteggioGiocatore==vittoria)
			System.out.println("Hai vinto!");
		else System.out.println("Hai perso!");

	}

}
