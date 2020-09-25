package figure;

public class Cerchio extends FiguraGeometrica {
	private double raggio;

	public Cerchio(double r) {
		raggio = r;
	}

	@Override
	public double perimetro() {
		return circonferenza();
	}
	
	public double circonferenza() {
		return (area()*2)/raggio;
	}

	@Override
	public double area() {
		return raggio*raggio*Math.PI;
	}
	
	public String toString() {
		return "Cerchio [Raggio = "+raggio+"]";
	}

}
