public class Rettangolo extends FiguraGeometrica {
	double base;
	double altezza;
	
	public Rettangolo(double base, double altezza){
		this.base=base;
		this.altezza=altezza;		
	}
	
	@Override
	public double perimetro(){
		return (base+altezza)*2;
	}
	
	@Override
	public double area(){
		return base*altezza;
	}
	
	public String toString(){
		return "Rettangolo [base="+base+"; altezza="+altezza+"]";
	}

}
