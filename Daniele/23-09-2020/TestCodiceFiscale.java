import java.util.Scanner;

public class TestCodiceFiscale {

	public static void main(String[] args) {
		Scanner tastiera=new Scanner(System.in);
		
		System.out.println("Inserisci codice fiscale: ");
		String cf=tastiera.next();
		cf=cf.toUpperCase();
		CodiceFiscale utente=new CodiceFiscale(cf);
		if(utente.isValid()) {
			System.out.println(utente);
		} else
			System.out.println("Codice fiscale non valido");
		
		
		tastiera.close();
		
	}

}
