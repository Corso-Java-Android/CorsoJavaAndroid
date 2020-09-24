package bootstrap;
import geometria.Rettangolo;
import geometria.Cerchio;

public class Main {

	public static void main(String[] args) {
		
		
		Rettangolo rett = new Rettangolo(10, 10);
		
		
		Cerchio cerch = new Cerchio(10.5);
		
		
		System.out.println("Il raggio è: "+ cerch.getRaggio() + 
						   "\nIl diametro è: " + cerch.diametro() + 
						   "\nLa circonferenza è: " + cerch.circonferenza() + 
						   "\nL'area è: " + cerch.area());
	}

}
