package geometria;
import java.lang.Math;

public class Cerchio {

	private double raggio;
	private double pigreco = Math.PI;

	
	public Cerchio(double r){
		raggio = r;
	}
	
	
	public double perimetro() { return Math.round(raggio*2*pigreco);}
	public double area() { return Math.round(Math.pow(raggio, 2)*pigreco);}
	
}
