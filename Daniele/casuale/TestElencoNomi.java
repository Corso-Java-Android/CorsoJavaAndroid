package casuale;

public class TestElencoNomi {

	public static void main(String[] args) {

		String[] listaNomi = { "Davide Pasquali", "Enrico Macrì", "Tommaso Segato", "Daniele Vittore", "Danis Moretta",
				"Erika Corallo", "Gabriele Lo Piccolo", "Giovanni Battista Cortese", "Karol Khaira",
				"Olivia Nadia Djeugove", "Sara Vizzacaro", "Valentina De Miglio", "Vincenzo Santoro",
				"Alessio Angelo Liotta" };
		ElencoNomi corsoJava = new ElencoNomi(listaNomi);
		ElencoNomiMod randomCorsoJava = new ElencoNomiMod(listaNomi.length);

		int i = 0;
		while (i < randomCorsoJava.length()) {
			String nomeCasuale = corsoJava.getNomeCasuale();
			if (!randomCorsoJava.contiene(nomeCasuale)) {
				randomCorsoJava.setNomeAtIndice(nomeCasuale, i);
				i++;
			}
		}

		randomCorsoJava.Stampa();

	}

}
