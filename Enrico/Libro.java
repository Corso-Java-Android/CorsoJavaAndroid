package LibroEsercizio;

public class Libro {
	private String Autore;
	private String Titolo;
	private String Editore;
	private int Prezzo;
	public Libro(String a,String t,String e, int p) {
		this.Autore = a;
		this.Titolo = t; 
		this.Editore = e;
		this.Prezzo = p;
	}

	public String getEditore() {
		return Editore.toString();
	}

	public void setEditore(String editore) {
		Editore = editore;
	}

	public int getPrezzo() {
		return Prezzo;
	}

	public void setPrezzo(int prezzo) {
		Prezzo = prezzo;
	}

	public String getAutore() {
		return Autore.toString();
	}

	public void setAutore(String autore) {
		Autore = autore;
	}

	public String getTitolo() {
		return Titolo.toString();
	}

	public void setTitolo(String titolo) {
		Titolo = titolo;
	}
	
public String stampa() {
	return "Il titolo del libro è : "+ this.Titolo + "L'autore è " + this.Autore + "L'editore è " +this.Editore + "Il prezzo è : " + this.Prezzo;
}
}

