package zoo;

public abstract class Animale {
	
	protected String nome;

	public Animale(String nome) {
		this.nome = nome;
	}

	public String mangia() {
		return this.nome + " sta mangiando.";
	}

	public String dorme() {
		return this.nome + " sta dormendo...";
	}

}
