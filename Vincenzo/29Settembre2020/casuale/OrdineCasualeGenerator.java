package casuale;

import java.util.List;
import java.util.Random;

public class OrdineCasualeGenerator {
	List<String> nominativi;
	
	public OrdineCasualeGenerator(List<String> nominativi) {
		this.nominativi = nominativi;
	}
	
	public List<String> nominativi() {
		Random rand = new Random(System.nanoTime());
		for(int i=0;i<nominativi.size();i++) {
			int index = rand.nextInt(nominativi.size());	//genero un indice casuale
			String temp = nominativi.get(index);	//salvo il contenuto di index in una var. temporanea
			nominativi.set(index, nominativi.get(i));	//inserisco il contenuto di i in index
			nominativi.set(i, temp);	//inserisco il contenuto di index in i tramite la var. temporanea
		}
		return nominativi;
	}
	

}
