import java.util.Scanner;

public class CalcolaCodiceFiscale {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il Codice Fiscale: ");
		String cf = input.next();
		CodiceFiscale codice = new CodiceFiscale(cf);
		System.out.println(codice.codiceInverso());
		input.close();

	}

}
