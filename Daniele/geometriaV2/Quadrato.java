package geometriaV2;

public class Quadrato extends Rettangolo {

	protected double lato;

	public Quadrato(double lato) {
		super(lato, lato);
		this.lato = lato;
	}

	public double getPerimetro() {
		return super.getPerimetro();
	}

	public double getArea() {
		return super.getArea();
	}

	@Override
	public String toString() {
		return "Quadrato [lato=" + lato + "]";
	}

}