package azienda;

public class Direttore extends Persona {

	public Direttore(String nome, String cognome) {
		super(nome, cognome);
	}

	public Direttore(String nome, String cognome, String email) {
		super(nome, cognome, email);
	}

	public String saluta() {
		return "Salve Direttor " + super.nome + " " + super.cognome;
	}

}
