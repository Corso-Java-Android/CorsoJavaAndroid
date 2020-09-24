package geometria;

public class Cerchio {
	private double raggio;

	public Cerchio(double raggio) {
		this.raggio = raggio;
	}

	public double area() {
		return Math.PI * raggio * raggio;
	}

	public double perimetro() {
		return Math.PI * 2 * raggio;
	}

	public double getRaggio() {
		return raggio;
	}

	public double diametro() {
		return raggio * 2;
	}
}
