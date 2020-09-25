package geometria;

public class Quadrato extends Rettangolo {

	public Quadrato(double lato) {
		super(lato, lato);
	}
	
	
	@Override
	public double perimetro() {
		return super.getBase()*4;
	}
	
	
	/* ATTENZIONE PER0'...I METODI VENGONO GIA' EREDITATI DALLA CLASSE MADRE RETTANGOLO
	
	@Override
	public double area() {
		return super.getBase() * super.getBase();
	}
	
	*/
	
	@Override
	public String toString() {
		return "quadrato di raggio: " + super.getBase();
	}
	
}
