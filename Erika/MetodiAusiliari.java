import java.util.Scanner;

public class MetodiAusiliari {
	
	public static String inserimentoCF() {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il codice fiscale: ");
		String cf = input.next();
		
			
		input.close();
		return cf;
		
		
	}

}
