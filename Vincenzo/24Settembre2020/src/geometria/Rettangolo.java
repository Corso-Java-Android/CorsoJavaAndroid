package geometria;

public class Rettangolo {
	private double altezza;
	private double base;

	public Rettangolo(double b, double a) {
		altezza = a;
		base = b;
	}

	public double perimetro() { return (base+altezza)*2; }
	public double area() { return base*altezza; }

}
