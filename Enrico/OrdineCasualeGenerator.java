package casuale;

import java.util.Random;

//a partire dall'elenco dei nominativi , generare l'ordine dei nominativi stessi
// no nominativi doppi

public class OrdineCasualeGenerator {

	public static void main(String[] args) {
		String lista[] = { "Davide Pasquali", "Enrico Macrì", "Tommaso Segato", "Daniele Vittore", "Danis Moretta",
				"Erika Corallo", "Gabriele Lo Piccolo", "Giovanni Battista Cortese", "Karol Khaira",
				"Olivia Nadia Djeugove", "Sara Vizzaclaro", "Valentina De Miglio", "Vincenzo Santoro", "Alessio" };

		Random n = new Random();
		int count = 0;

		for (; count < lista.length;) {

			int rand = n.nextInt(lista.length);
			if (lista[rand] == null) {
				continue;
			}
			System.out.println(lista[rand] + "  " + count);

			count++;
			lista[rand] = null;

		}

	}
}
