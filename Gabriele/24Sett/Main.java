import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Calcolatrice cal = new Calcolatrice();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero: ");
		
		double primoNumero = sc.nextDouble();
		
		System.out.println("Inserisci il secondo numero: ");
		
		double secondoNumero = sc.nextDouble();
		
		
		System.out.println("La somma è: " + cal.somma(primoNumero, secondoNumero));
		System.out.println("La differenza è: " + cal.sottrazione(primoNumero, secondoNumero));
		System.out.println("La moltiplicazione è : " + cal.moltiplicazine(primoNumero, secondoNumero));
		System.out.println("La divisione è: " + cal.divisione(primoNumero, secondoNumero));
		
		sc.close();	
	}

}
