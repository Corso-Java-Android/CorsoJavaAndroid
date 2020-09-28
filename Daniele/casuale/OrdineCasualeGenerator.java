package casuale;

import java.util.Random;

public class OrdineCasualeGenerator {

	public static void main(String[] args) {
		String[] elenco = { "Davide Pasquali", "Enrico Macrì", "Tommaso Segato", "Daniele Vittore", "Danis Moretta",
				"Erika Corallo", "Gabriele Lo Piccolo", "Giovanni Battista Cortese", "Karol Khaira",
				"Olivia Nadia Djeugove", "Sara Vizzacaro", "Valentina De Miglio", "Vincenzo Santoro",
				"Alessio Angelo Liotta" };
		String[] casuale = new String[elenco.length];

		Random rand = new Random(System.currentTimeMillis());

		int i = 0;
		while (i < casuale.length) {
			int interoCasuale = rand.nextInt(elenco.length);
			boolean inserito = false;
			for (int j = 0; j < i && !inserito; j++) {
				if (casuale[j] == elenco[interoCasuale])
					inserito = true;
			}
			if (!inserito) {
				casuale[i] = elenco[interoCasuale];
				i++;
			}
		}

		for (int j = 0; j < casuale.length; j++) {
			System.out.println((j + 1) + ". " + casuale[j]);
		}

	}

}
