
public class Libro {
	private String autore;
	private String titolo;
	private String editore="";
	private double prezzo=0.0;
	
	//Autore e Titolo sono obbligatori
	public Libro(String autore, String titolo) {
		this.autore = autore;
		this.titolo = titolo;
	}
	
	public Libro(String autore, String titolo, String editore) {
		this.autore = autore;
		this.titolo = titolo;
		this.editore = editore;
	}
	
	public Libro(String autore, String titolo, double prezzo) {
		this.autore = autore;
		this.titolo = titolo;
		this.prezzo = prezzo;
	}
	
	public Libro(String autore, String titolo, String editore, double prezzo) {
		this.autore = autore;
		this.titolo = titolo;
		this.editore = editore;
		this.prezzo = prezzo;
		
	}
	
	public String getAutore() {
		return autore;
	}
	public String getTitolo() {
		return titolo;
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
	
	//restituisce una rappresentazione in formato stringa del libro
	public String toString() {
		if(editore.equals("")&&prezzo==0.0)
			return "Autore: "+autore+". Titolo: "+titolo;
		else if(prezzo==0.0)
			return "Autore: "+autore+". Titolo: "+titolo+". Editore: "+editore;
		else if(editore.equals(""))
			return "Autore: "+autore+". Titolo: "+titolo+". Prezzo: "+prezzo;
		return "Autore: "+autore+". Titolo: "+titolo+". Editore: "+editore+". Prezzo: "+prezzo;
	}

}
