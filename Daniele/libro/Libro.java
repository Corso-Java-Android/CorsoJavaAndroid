package libro;

public class Libro {
	private String titolo;
	private String autore;
	private String editore = "Non edito";
	private double prezzo = 0.0;

	public Libro(String titolo, String autore) {
		this.titolo = titolo;
		this.autore = autore;
	}

	public Libro(String titolo, String autore, String editore, double prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		this.editore = editore;
		this.prezzo = prezzo;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getAutore() {
		return autore;
	}

	public String toString() {
		return "Autore: " + this.autore + "\tTitolo: " + this.titolo + "\nEditore: " + this.editore + "\tPrezzo: "
				+ this.prezzo;
	}

}
