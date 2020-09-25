package geometriaV2;

public class Cerchio extends FiguraGeometrica {
	protected double raggio;

	public Cerchio(double raggio) {
		this.raggio = raggio;
	}

	public double getPerimetro() {
		return 2 * Math.PI * this.raggio;
	}

	public double getArea() {
		return Math.PI * this.raggio * this.raggio;
	}

	public double getDiametro() {
		return this.raggio * 2;
	}

	@Override
	public String toString() {
		return "Cerchio [raggio=" + raggio + "]";
	}

}