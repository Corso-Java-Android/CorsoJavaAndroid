package figure;

public class Quadrato extends Rettangolo{

	public Quadrato(double lato) {
		super(lato, lato);
	}
	
	public String toString() {
		return "Quadrato [lato = "+super.base+"]";
	}

}
