package casuale;

import java.util.Arrays;
import java.util.List;

public class OrdineTest {

	public static void main(String[] args) {
		String[] nomi = {"Alessio Angelo Liotta", "Davide Pasquali", "Enrico Macrì", "Tommaso Segato", "Daniele Vittore", "Danis Moretta", "Erika Corallo", "Gabriele Lo Piccolo", "Giovanni Battista Cortese", "Karol Khaira", "Olivia Nadia Djeugove", "Sara Vizzaclaro", "Valentina De Miglio", "Vincenzo Santoro"};
		List<String> nominativi = Arrays.asList(nomi.clone());
		OrdineCasualeGenerator generatore = new OrdineCasualeGenerator(nominativi);
		System.out.println("Ci sono "+nominativi.size()+" nominativi");
		for(int i=0;i<nominativi.size();i++) {	//nominativi in ordine
			System.out.println(nominativi.get(i));
		}

		System.out.println("===============");
		List<String> nominativi2 = generatore.nominativi();	//ordinamento casuale
		System.out.println("Dopo lo shuffle ci sono "+nominativi2.size()+" nominativi");
		for(int i=0;i<nominativi2.size();i++) {	//nominativi in ordine casuale

			System.out.println(nominativi2.get(i));
		}
		System.out.println("===============");
		List<String> newNominativi = Arrays.asList(nomi.clone());
		generatore = new OrdineCasualeGenerator(newNominativi);
		System.out.println("Ci sono "+newNominativi.size()+" nominativi");
		for(int i=0;i<newNominativi.size();i++) {	//nominativi in ordine
			System.out.println(newNominativi.get(i));
		}

		System.out.println("===============");
		nominativi2 = generatore.nominativi();	//ordinamento casuale
		System.out.println("Dopo lo shuffle ci sono "+nominativi2.size()+" nominativi");
		for(int i=0;i<nominativi2.size();i++) {	//nominativi in ordine casuale
			System.out.println(nominativi2.get(i));
		}

	}

}
