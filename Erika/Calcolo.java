import java.util.Scanner;

public class Calcolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcolatrice cal = new Calcolatrice();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero");
		
		double primoNum = sc.nextDouble();
		
		System.out.println("Inserisci il secondo numero");
		
		double secondoNum = sc.nextDouble();
		
		System.out.println("La somma è " + cal.somma(primoNum, secondoNum));
		System.out.println("La sottrazione è " + cal.sottrazione(primoNum, secondoNum));
		System.out.println("La moltiplicazione è " + cal.moltiplicazione(primoNum, secondoNum));
		System.out.println("La divisione è " + cal.divisione(primoNum, secondoNum));
		
		sc.close();
	}

}
