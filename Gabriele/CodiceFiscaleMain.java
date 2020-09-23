import java.util.Scanner;

public class CodiceFiscaleMain {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		CodiceFiscale codice1 = new CodiceFiscale();
		
		System.out.println("Inserisci il codice fiscale");
		
		String codice = s.next();
		
		codice = codice.toUpperCase();
		
		if(codice1.verificaCodice(codice)) {
			
			codice1.annoDiNascita(codice);
			codice1.meseDiNascita(codice);
			codice1.giornoDiNascita(codice);
			codice1.sesso(codice);
			codice1.eta(codice);
			
			System.out.println(codice1.toString());
			
		} else {
			System.out.println("CODICE FISCALE ERRATO");
		}
		
		
		
		
		
		s.close();
		
		
	}

}
