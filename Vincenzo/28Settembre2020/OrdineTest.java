package casuale;

public class OrdineTest {

	public static void main(String[] args) {
		String[] nominativi = {"Alessio Angelo Liotta", "Davide Pasquali", "Enrico Macrì", "Tommaso Segato", "Daniele Vittore", "Danis Moretta", "Erika Corallo", "Gabriele Lo Piccolo", "Giovanni Battista Cortese", "Karol Khaira", "Olivia Nadia Djeugove", "Sara Vizzaclaro", "Valentina De Miglio", "Vincenzo Santoro"};
		OrdineCasualeGenerator generatore = new OrdineCasualeGenerator(nominativi.clone());
		System.out.println("Ci sono "+nominativi.length+" nominativi");
		for(int i=0;i<nominativi.length;i++)	//nominativi in ordine
			System.out.println(nominativi[i]);
		System.out.println("===============");
		String[] nominativi2 = generatore.nominativi();	//ordinamento casuale
		System.out.println("Dopo lo shuffle ci sono "+nominativi2.length+" nominativi");
		for(int i=0;i<nominativi2.length;i++) {	//nominativi in ordine casuale
			System.out.println(nominativi2[i]);
		}
		System.out.println("===============");
		generatore = new OrdineCasualeGenerator(nominativi.clone());
		System.out.println("Ci sono "+nominativi.length+" nominativi");
		for(int i=0;i<nominativi.length;i++)	//nominativi in ordine
			System.out.println(nominativi[i]);
		System.out.println("===============");
		nominativi2 = generatore.nominativi();	//ordinamento casuale
		System.out.println("Dopo lo shuffle ci sono "+nominativi2.length+" nominativi");
		for(int i=0;i<nominativi2.length;i++) {	//nominativi in ordine casuale
			System.out.println(nominativi2[i]);
		}

	}

}
