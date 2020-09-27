public class Esagono extends FiguraGeometrica{
	
	public double lato;
	
	public Esagono(double lato){
		this.lato=lato;
	}
	
	
	
	@Override
	public double perimetro(){
		return lato*6;
	}
	
	@Override
	public double area(){
		return (perimetro()*lato*0.866)/2;
	}
	
	public String toString(){
		return "Esagono [lato="+lato+"]";
	}

}
