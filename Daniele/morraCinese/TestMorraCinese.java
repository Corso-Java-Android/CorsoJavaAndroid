package morraCinese;

import java.util.Scanner;

public class TestMorraCinese {

	public static void main(String[] args) {
		MorraCinese partita = new MorraCinese();

		Scanner input = new Scanner(System.in);
		System.out.println("Inserire punteggio per la vittoria: ");
		int punteggioVittoria = input.nextInt();

		partita.gioca(punteggioVittoria);

		input.close();
	}

}

