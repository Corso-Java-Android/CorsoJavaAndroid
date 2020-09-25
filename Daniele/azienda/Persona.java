package azienda;

public class Persona {
	protected String nome;
	protected String cognome;
	protected String email;

	public Persona(String nome, String cognome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		
	}

	public String getNome() {
		return nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return this.nome + ", Email: " + this.email;
	}
	
	public String saluta() {
		return "Buongiorno sig. " + this.cognome + " " + this.nome;
	}
}
