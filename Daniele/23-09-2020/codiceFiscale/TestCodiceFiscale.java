package codiceFiscale;

import metodiUtility.*;

public class TestCodiceFiscale {

	public static void main(String[] args) {

		CodiceFiscale utente = new CodiceFiscale(
				MetodiAusiliari.inputStringa("Inserisci Codice Fiscale").toUpperCase());
		if (utente.isValid()) {
			System.out.println(utente);
		} else
			System.out.println("Codice fiscale non valido");

	}

}
