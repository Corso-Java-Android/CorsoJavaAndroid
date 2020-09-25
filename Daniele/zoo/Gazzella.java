package zoo;

public class Gazzella extends Animale {

	public Gazzella(String nome) {
		super(nome);
	}

	public String scappa() {
		return super.nome + " sta scappando...";
	}

}
