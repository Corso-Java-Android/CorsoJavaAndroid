package geometria;

public abstract class Quadrilatero {

	
	private double lato1,lato2,lato3,lato4;
	
	public Quadrilatero(double lato1, double lato2, double lato3, double lato4) {
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
		this.lato4 = lato4;
	}
	
	public Quadrilatero(double lato1) {
		this.lato1 = lato1;
	}
	
	
	
	
	public double perimetro() {
		return lato1 + lato2 + lato3 + lato4;
	}
	
	
	
	
	
}
