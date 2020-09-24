package geometria;

public class Cerchio {
	
	
	private double raggio;
	
	
	public Cerchio(double raggio) {
		this.raggio = raggio;
	}
	
	public double getRaggio() {
		return raggio;
	}
	
	
	public double diametro() {
		return raggio * 2;
	}
	
	public double area() {
		return Math.pow(raggio, 2) * Math.PI;
	}
	
	public double circonferenza() {
		return 2*Math.PI*raggio;
	}
	
		
}
