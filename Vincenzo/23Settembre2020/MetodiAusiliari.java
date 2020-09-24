import java.util.Scanner;

public class MetodiAusiliari {
	static String cf;
	
	public static String inputStringa(String messaggio) {
		Scanner input = new Scanner(System.in);
		System.out.print(messaggio);
		cf = input.next();
		input.close();
		return cf;
	}
}
