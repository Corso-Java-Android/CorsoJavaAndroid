import java.util.Scanner;

public class CodiceFiscaleMain {

	public static void main(String[] args) {
				
		System.out.println("Inserisci il codice fiscale");	
		Scanner in = new Scanner(System.in);
		String codFis = in.nextLine();
		
		codFis = codFis.toUpperCase();
		
		CodiceFiscale cod = new CodiceFiscale();
		
		if(cod.controllo(codFis)) {
		
			System.out.println("Anno di nascita: " + cod.annoNascita(codFis));
			System.out.println("Mese di nascita: " + cod.meseNascita(codFis));
			System.out.println("Giorno di nascita: " + cod.giornoNascita(codFis));
			System.out.println("Età: " + cod.età(codFis));
			System.out.println("Sesso " + cod.sesso(codFis));
			
		}else System.out.println("Codice fiscale errato");
		
	}
	
	private static String inputCF() {
		
		System.out.println("Inserisci il codice fiscale");
		Scanner in = new Scanner(System.in);
		String codFis = in.nextLine();
		in.close();
		return codFis;
	}

}
