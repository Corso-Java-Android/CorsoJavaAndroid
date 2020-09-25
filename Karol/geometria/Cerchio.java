package geometria;

public class Cerchio {
	private double raggio;
	
	public Cerchio(double raggio) {
		this.raggio = raggio;
	}
	
	public double circonferenza() {
		return 2 * Math.PI * raggio;
	}
	
	public double area() {
		return Math.PI * raggio * raggio;
	}
}
