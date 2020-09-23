import java.util.*;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un nome");
		
		//viene richiesto di inserire testo dalla tastiera con .next()
		String nome = input.nextLine();
		//String nome = input.next();
		System.out.println(nome);
		input.close();
		
	}

}
