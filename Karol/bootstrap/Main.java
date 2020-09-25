package bootstrap;

import geometria.Cerchio;
import geometria.Rettangolo;

public class Main {
	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo(18,50);
		Rettangolo r2 = new Rettangolo(20,100);
		
		System.out.println("R1 Area=" + r1.area() + " Perimetro=" + r1.perimetro());
		System.out.println("R1 Area=" + r2.area() + " Perimetro=" + r2.perimetro());
		
		Cerchio c1 =  new Cerchio(3);
		
		System.out.println("Area: " + c1.area());
		System.out.println("Circonferenza: " + c1.circonferenza());
		
		System.out.println(Math.PI);

	}
}
