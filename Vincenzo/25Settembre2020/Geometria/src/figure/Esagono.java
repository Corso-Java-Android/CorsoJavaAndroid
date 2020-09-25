package figure;
public class Esagono extends FiguraGeometrica {
	double lato;

	public Esagono(double lato) {
		this.lato = lato;
	}

	@Override
	public double perimetro() {
		return lato*6;
	}

	@Override
	public double area() {
		return (3*Math.sqrt(3)*lato*lato)/2;
	}
	
	public String toString() {
		return "Esagono [lato = "+lato+"]";
	}

}
