public abstract class Quadrilatero {

	protected double lato1;
	protected double lato2;
	protected double lato3;
	protected double lato4;
	
	public Quadrilatero() {}
	
	public Quadrilatero(double lato1, double lato2,double lato3,double lato4) {
		this.lato1=lato1;
		this.lato2=lato2;
		this.lato3=lato3;
		this.lato4=lato4;		
	}
	public double getPerimetro() {
		return lato1+lato2+lato3+lato4;
	}
	
	public abstract double getArea();
	
	public void print() {
		
		System.out.println("Il perimetro è "+getPerimetro());
		System.out.println("Area: "+getArea());
		System.out.println("###########################################################");
	}
	
}
