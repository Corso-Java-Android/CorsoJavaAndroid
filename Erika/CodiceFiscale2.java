import java.util.Scanner;


public class CodiceFiscale2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		CodiceFiscale cf = new CodiceFiscale();
		
		System.out.println("Inserisci il tuo codice fiscale");
		
		String codiceFiscale = input.next();
		codiceFiscale = codiceFiscale.toUpperCase();
		
		if(cf.lunghezza(codiceFiscale)) {
			
			cf.annoNascita(codiceFiscale);
			cf.meseNascita(codiceFiscale);
			cf.giornoNascita(codiceFiscale);
			cf.eta(codiceFiscale);
			cf.sesso(codiceFiscale);
			
			System.out.println(cf.soluzione());
		}		
		else System.out.println("Codice fiscale errato");
		
		input.close();
		
	}

}
