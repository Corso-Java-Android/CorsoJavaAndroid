
public class Animale {
	protected String Nome = "";
	
	public Animale(String Nome){
		this.Nome = Nome;
	}
	
	public String Mangia() {
		return this.Nome + " sta Mangiando.";
	}
	
	public String Dorme() {
		return this.Nome + " sta dormendo...";
	}

}
