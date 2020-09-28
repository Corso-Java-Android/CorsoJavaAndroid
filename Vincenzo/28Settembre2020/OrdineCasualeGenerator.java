package casuale;

import java.util.Random;

public class OrdineCasualeGenerator {
	String[] nominativi;
	
	public OrdineCasualeGenerator(String[] nominativi) {
		this.nominativi = nominativi;
	}
	
	public String[] nominativi() {
		Random rand = new Random(System.nanoTime());
		for(int i=0;i<nominativi.length;i++) {
			int index = rand.nextInt(nominativi.length);	//genero un indice casuale
			String temp = nominativi[index];	//salvo il contenuto di index in una var. temporanea
			nominativi[index] = nominativi[i];	//inserisco il contenuto di i in index
			nominativi[i] = temp;	//inserisco il contenuto di index in i tramite la var. temporanea
		}
		return nominativi;
	}
	

}
