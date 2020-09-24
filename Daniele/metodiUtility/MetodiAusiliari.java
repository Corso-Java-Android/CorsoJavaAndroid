package metodiUtility;

import java.util.Scanner;

public class MetodiAusiliari {

	public static String inputStringa(String messaggio) {
		Scanner tastiera = new Scanner(System.in);

		System.out.println(messaggio);
		String cf = tastiera.next();

		return cf;
	}

}
