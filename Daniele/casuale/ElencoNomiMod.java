package casuale;

public class ElencoNomiMod {
	private String[] elenco;

	public ElencoNomiMod(int lunghezza) {
		elenco = new String[lunghezza];
	}

	public boolean contiene(String nome) {
		boolean contiene = false;
		for (int i = 0; i < elenco.length && !contiene; i++) {
			contiene = elenco[i] == nome;
		}
		return contiene;
	}

	public void setNomeAtIndice(String nome, int indice) {
		this.elenco[indice] = nome;
	}

	public void Stampa() {
		for (int i = 0; i < elenco.length; i++)
			System.out.println((i + 1) + ". " + elenco[i]);
	}

	public int length() {
		return elenco.length;
	}
}
