
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner (System.in);
		
		CodiceFiscale cf=new CodiceFiscale();
		System.out.println("Inserisci il tuo codice fiscale: ");
		String codFiscale= in.next();
		codFiscale=codFiscale.toUpperCase();
		if(cf.lunghezza(codFiscale)) {
			cf.newCodFiscale(codFiscale);
			System.out.println(cf.soluzione());
			
		}
		else System.out.println("Errore nel inserimento codice fiscale!");
		in.close();
	
	}

}
