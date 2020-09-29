package OrdineCasuale;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrdineCasualeMain {

	public static void main(String[] args) {

		// rdineCasualeGenerator ordine = new OrdineCasualeGenerator();

		// System.out.println(ordine.ordineCasuale());
		
		List<String> lista = new ArrayList<String>();

		Random rand = new Random();

		String nomi1[] = { "Davide Pasquali", "Enrico Macrì", "Tommaso Segato", "Daniele Vittore", "Danis Moretta",
				"Erika Corallo", "Gabriele Lo Piccolo", "Giovanni Battista Cortese", "Karol Khaira",
				"Olivia Nadia Djeugove", "Sara Vizzaclaro", "Valentina De Miglio", "Vincenzo Santoro" };
		
		for(String s : nomi1) {
			lista.add(s);
			System.out.println(s);
		}
		
		System.out.println("------------");
	
		/*
		 * for(String s : nomi1) { System.out.println(s);
		 * System.out.println(s.length()); }
		 */

		// System.out.println(nomi1.length);

		int counter = 0;

		for (;counter < nomi1.length;) {

			int val = rand.nextInt(nomi1.length);

			if (nomi1[val] == null) {
				continue;
			}

			System.out.println(nomi1[val] + " " + counter);
			counter++;
			nomi1[val] = null;
		}
		
		System.out.println("-------");
		
		int count = 0;
		
		while(count<lista.size()) {
     		int val = rand.nextInt(lista.size());
			
			if(lista.get(val) == null) {
				continue;
			}
			
			System.out.println(lista.get(val));
			counter++;
			lista.remove(lista.get(val));
		}

	}

}
