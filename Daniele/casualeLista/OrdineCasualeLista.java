package casualeLista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class OrdineCasualeLista {

	public static void main(String[] args) {

		String[] elenco = { "Davide Pasquali", "Enrico Macrì", "Tommaso Segato", "Daniele Vittore", "Danis Moretta",
				"Erika Corallo", "Gabriele Lo Piccolo", "Giovanni Battista Cortese", "Karol Khaira",
				"Olivia Nadia Djeugove", "Sara Vizzacaro", "Valentina De Miglio", "Vincenzo Santoro" };

		Random rand = new Random(System.currentTimeMillis());

		List<String> listaNomi = new ArrayList<String>();

		Collections.addAll(listaNomi, elenco);
		System.out.println("Lista ordinata randomicamente usando lista Collections.addAll(...)");
		while (listaNomi.size() > 0) {
			int interoCasuale = rand.nextInt(listaNomi.size());
			System.out.println(listaNomi.get(interoCasuale));
			listaNomi.remove(interoCasuale);
		}

		listaNomi = Arrays.asList(elenco.clone());
		List<String> listaNomiRand = new ArrayList<String>();

		System.out.println("Lista ordinata randomicamente usando lista Arrays.asList(...)");

		while (listaNomiRand.size()<listaNomi.size()) {
			int interoCasuale = rand.nextInt(listaNomi.size());
			String nome = listaNomi.get(interoCasuale);
			if(!listaNomiRand.contains(nome)){
				listaNomiRand.add(nome);
			}
		}
		listaNomiRand.forEach(x -> System.out.println(x));

	}

}
