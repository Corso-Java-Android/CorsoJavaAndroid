package geometria;

public class Cerchio {
	private double raggio;

	public Cerchio(double r) {
		raggio = r;
	}
	
	public double getRaggio() {
		return raggio;
	}
	
	public double Area() {
		return raggio*raggio*Math.PI;
	}
	
	public double Circonferenza() {
		//Area = (Circonferenza * Raggio)/2
		return (Area()*2)/raggio;
	}
	
	public double Diametro() {
		return raggio*2;
	}
}
