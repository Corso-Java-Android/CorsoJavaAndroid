import java.util.Scanner;

public class MetodiAusiliari {
	static String cf;
	static Scanner input;
	
	public static void apriScanner() {
		input = new Scanner(System.in);
	}
	
	public static String inputStringa(String messaggio) {
		System.out.print(messaggio);
		cf = input.next();
		return cf;
	}
	
	public static void chiudiScanner() {
		input.close();
	}
}
