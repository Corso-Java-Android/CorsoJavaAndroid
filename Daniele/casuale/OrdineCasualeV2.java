package casuale;

import java.util.Random;

public class OrdineCasualeV2 {

	public static void main(String[] args) {
		String[] elenco = { "Davide Pasquali", "Enrico Macrì", "Tommaso Segato", "Daniele Vittore", "Danis Moretta",
				"Erika Corallo", "Gabriele Lo Piccolo", "Giovanni Battista Cortese", "Karol Khaira",
				"Olivia Nadia Djeugove", "Sara Vizzacaro", "Valentina De Miglio", "Vincenzo Santoro",
				"Alessio Angelo Liotta" };
		Random rand = new Random(System.currentTimeMillis());

		int i = 0;
		while (i < elenco.length) {
			int interoCasuale = rand.nextInt(elenco.length);
			if (null != elenco[interoCasuale]) {
				System.out.println((i + 1) + ". " + elenco[interoCasuale]);
				elenco[interoCasuale] = null;
				i++;
			}
		}
	}

}
