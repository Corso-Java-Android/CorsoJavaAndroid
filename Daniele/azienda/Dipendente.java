package azienda;

public class Dipendente extends Persona {

	public Dipendente(String nome, String cognome) {
		super(nome, cognome);
	}

	public Dipendente(String nome, String cognome, String email) {
		super(nome, cognome, email);
	}

	public int stipendio() {
		return 1200;
	}

	public String toString() {
		return "Dipendente: " + super.nome + " " + super.cognome + ", guadagna " + this.stipendio() + " E./mese";
	}

}
