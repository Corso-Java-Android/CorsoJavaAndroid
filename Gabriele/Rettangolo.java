package geometria;

public class Rettangolo {
	
	private double base;
	private double altezza;
	
	public Rettangolo() {
		
	}
	
	
	public Rettangolo(double a, double b) {
		base = a;
		altezza = b;
	}
	
	public double perimetro() {
		return (this.base)*2 + (this.altezza)*2;
	}
	
	public double area() {
		return base * altezza;
	}
	
}
