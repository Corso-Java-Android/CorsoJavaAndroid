import java.util.Scanner;

public class TestCalcolatrice {

	public static void main(String[] args) throws Exception {
		Calcolatrice cal = new Calcolatrice();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci il primo numero: ");
		double a = in.nextDouble();
		System.out.print("Inserisci il secondo numero: ");
		double b = in.nextDouble();
		
		System.out.println("Somma: "+cal.somma(a, b));
		System.out.println("Sottrazione: "+cal.sottrazione(a, b));
		System.out.println("Moltiplicazione: "+cal.moltiplicazione(a, b));
		System.out.println("Divisione: "+cal.divisione(a, b));
		in.close();

	}

}
