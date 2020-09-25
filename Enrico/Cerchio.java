package geometria;

public class Cerchio {

	private double pgreco=Math.PI;// indica il valore del PGRECO
	private double raggio;
	
	public Cerchio (double r) { //costruttore
		raggio=r;
		
	}
	public double perimetro() {return raggio*2*pgreco;}
	public double area() {return raggio*raggio*pgreco;}
}

