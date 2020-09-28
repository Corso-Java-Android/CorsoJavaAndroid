package casuale;

import java.util.Random;

public class ElencoNomi {

	private String[] elenco;
	private Random rand = new Random(System.currentTimeMillis());

	public ElencoNomi(String[] elenco) {
		this.elenco = elenco;
	}

	public String getNomeCasuale() {
		return elenco[rand.nextInt(elenco.length)];
	}

	public void Stampa() {
		for (int i = 0; i < elenco.length; i++)
			System.out.println((i + 1) + ". " + elenco[i]);
	}

	public int length() {
		return elenco.length;
	}

}
