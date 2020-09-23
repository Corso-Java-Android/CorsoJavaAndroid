package contoCorrente;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un nome:");
        String nome = input.nextLine();

        System.out.println(nome);

        input.close();
    }
}
