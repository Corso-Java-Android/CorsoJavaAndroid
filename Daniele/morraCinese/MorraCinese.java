package morraCinese;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import metodiUtility.*;

public class MorraCinese {
	private int punteggioPc;
	private int punteggioGiocatore;

	private String mossaPc() {
		Random rand = new Random(System.currentTimeMillis());
		int val = rand.nextInt(3);
		if (val == 0)
			return "Sasso";
		else if (val == 1)
			return "Carta";
		else
			return "Forbici";
	}

	public void stampaPunteggio() {
		System.out.println("\nPunteggio PC: " + punteggioPc + "\nPunteggio Giocatore: " + punteggioGiocatore);
	}

	private int pcSasso(String mossaUtente) {
		if (mossaUtente.equalsIgnoreCase("Sasso"))
			return 0;
		else if (mossaUtente.equalsIgnoreCase("Carta"))
			return 1;
		else
			return -1;
	}

	private int pcCarta(String mossaUtente) {
		if (mossaUtente.equalsIgnoreCase("Carta"))
			return 0;
		else if (mossaUtente.equalsIgnoreCase("Forbici"))
			return 1;
		else
			return -1;
	}

	private int pcForbici(String mossaUtente) {
		if (mossaUtente.equalsIgnoreCase("Forbici"))
			return 0;
		else if (mossaUtente.equalsIgnoreCase("Sasso"))
			return 1;
		else
			return -1;
	}

	private void aggiornaPunteggio(String mossaUtente) {
		int risultato = confronto(mossaUtente);
		if (risultato == 1)
			punteggioGiocatore++;
		else if (risultato == -1)
			punteggioPc++;
	}

	private int confronto(String mossaUtente) {
		String mossaPc = mossaPc();
		System.out.println("Il PC gioca: " + mossaPc);
		if (mossaPc.equals("Sasso"))
			return pcSasso(mossaUtente);
		else if (mossaPc.equals("Carta"))
			return pcCarta(mossaUtente);
		else
			return pcForbici(mossaUtente);
	}

	private int getPunteggioPc() {
		return punteggioPc;
	}

	private void setPunteggioPc(int punteggioPc) {
		this.punteggioPc = punteggioPc;
	}

	private int getPunteggioGiocatore() {
		return punteggioGiocatore;
	}

	private void setPunteggioGiocatore(int punteggioGiocatore) {
		this.punteggioGiocatore = punteggioGiocatore;
	}

	public void gioca(int punteggioVittoria) {
		setPunteggioGiocatore(0);
		setPunteggioPc(0);

		do {
			aggiornaPunteggio(MetodiAusiliari.inputStringa("Sasso, Carta o Forbici? "));
			stampaPunteggio();
			if (getPunteggioGiocatore() == punteggioVittoria)
				System.out.println("Hai vinto");
			else if (getPunteggioPc() == punteggioVittoria)
				System.out.println("Il PC ha vinto!");
		} while (getPunteggioGiocatore() != punteggioVittoria && getPunteggioPc() != punteggioVittoria);

	}

	public void giocaPc(int punteggioVittoria) {
		setPunteggioGiocatore(0);
		setPunteggioPc(0);

		do {
			String mossaPcDue = mossaPc();
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (Exception e) {
				System.out.println("Errore funzione TimeUnit.SECONDS.sleep");
			}

			aggiornaPunteggio(mossaPcDue);
			System.out.println("Mossa PC due: " + mossaPcDue);
			System.out.println("\nPunteggio PC: " + punteggioPc + "\nPunteggio PC Due: " + punteggioGiocatore);
			if (punteggioGiocatore == punteggioVittoria)
				System.out.println("Il PC Due ha vinto");
			else if (punteggioPc == punteggioVittoria)
				System.out.println("Il PC ha vinto!");
		} while (punteggioGiocatore != punteggioVittoria && punteggioPc != punteggioVittoria);

	}

}

