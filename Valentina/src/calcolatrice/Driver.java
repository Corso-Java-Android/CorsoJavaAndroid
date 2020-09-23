package calcolatrice;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Calcolatrice ca1 = new Calcolatrice();

        Scanner sc = new Scanner(System.in);

        double numeroUno, numeroDue;

        System.out.println("Inserisci il primo numero: ");
        numeroUno = sc.nextDouble();

        System.out.println("Inserisci il secondo numero: ");
        numeroDue = sc.nextDouble();

        sc.close();

        System.out.println("Somma: "        + ca1.somma     (numeroUno, numeroDue));
        System.out.println("Sottrazione: "  + ca1.sottrai   (numeroUno, numeroDue));
        System.out.println("Prodotto: "     + ca1.moltiplica(numeroUno, numeroDue));
        System.out.println("Divisione: "    + ca1.dividi    (numeroUno, numeroDue));

    }
}
