public class Animale {
	protected String name="";
	
	public Animale(String name) {
		this.name=name;
	}
	
	public String mangia(){
		return this.name+" sta Mangiando.";
	}
	
	public String dorme(){
		return this.name+" sta Dormendo...";
	}

}
