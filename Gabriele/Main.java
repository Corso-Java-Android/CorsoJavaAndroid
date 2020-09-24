package bootstrap;
import geometria.Rettangolo;
import geometria.Cerchio;

public class Main {

	public static void main(String[] args) {
		
		
		Rettangolo rett = new Rettangolo(10, 10);
		
		
		Cerchio cerch = new Cerchio(10.5);
		
		
		System.out.println("Il raggio �: "+ cerch.getRaggio() + 
						   "\nIl diametro �: " + cerch.diametro() + 
						   "\nLa circonferenza �: " + cerch.circonferenza() + 
						   "\nL'area �: " + cerch.area());
	}

}
