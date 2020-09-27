public class Cerchio extends FiguraGeometrica{
	
	private double raggio;
	
	public Cerchio(double raggio) {
		this.raggio=raggio;
	}
	
	public double diametro(){
		return raggio+raggio;
	}
	
	@Override
	public double perimetro(){
		return circonferenza();
	} 
	
	public double circonferenza(){
		return diametro()*Math.PI;
	}
	
	@Override
	public double area(){
		return raggio*raggio*Math.PI;
	}
	
	public String toString(){
		return "Cerchio [Raggio= "+raggio+"]";
	}

}
