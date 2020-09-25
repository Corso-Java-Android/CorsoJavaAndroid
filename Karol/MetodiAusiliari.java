import java.util.Scanner;

public class MetodiAusiliari {
	static String cf;
	static Scanner input;
	
	public static void apriScanner() {
		input = new Scanner(System.in);
	}
	
	public static String inputStringa(){
		cf=input.next();
		return cf;
	}
	
	public static void chiudiScanner() {
		input.close();
	}
}

