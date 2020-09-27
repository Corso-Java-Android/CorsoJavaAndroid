

public class Cerchio {
 private double raggio;

 
 public Cerchio(double r) {
	 raggio=r;
 }
 
 public double getRaggio(){return raggio;}

 public double diametro() {return raggio*2;}
 
 public double circonferenza(){return raggio*2*Math.PI;}

 public double area() {return raggio*raggio*Math.PI;}


	
	
}
