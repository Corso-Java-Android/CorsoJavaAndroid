package figure;

public class Rettangolo extends FiguraGeometrica {
	protected double base;
	protected double altezza;

	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return (base*2)+(altezza*2);
	}

	@Override
	public double area() {
		return base*altezza;
	}
	
	public String toString() {
		return "Rettangolo [base = "+base+" altezza = "+altezza+"]";
	}

}
