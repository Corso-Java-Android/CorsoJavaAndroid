package morraCinese;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        int maxPunteggio = 2;
        Scanner scanner = new Scanner(System.in);

        MorraCinese morraCinese = new MorraCinese(maxPunteggio, scanner);

        while (!morraCinese.isEndGame())
            morraCinese.gioca();

        scanner.close();
    }
}
