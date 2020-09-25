package geometriaV2;

public class Rettangolo extends Quadrilatero {
	protected double base;
	protected double altezza;

	public Rettangolo(double base, double altezza) {
		super(base, altezza, base, altezza);
		this.base = base;
		this.altezza = altezza;
	}

	public double getArea() {
		return super.latoUno * super.latoDue;
	}

	public double getPerimetro() {
		return super.getPerimetro();
	}

	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + "]";
	}

}