package contoCorrente;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire nome e cognome: ");
        String nomeCognome = scanner.nextLine();

        System.out.println("Inserire codice conto: ");
        int cod = scanner.nextInt();

        System.out.println("Inserire saldo: (Non abusarne dai)");
        double saldo = scanner.nextDouble();


        ContoCorrente cc = new ContoCorrente(nomeCognome, saldo, cod);

        System.out.println("Digita P per prelievo, oppure V per versamento: ");
        String operazione = scanner.next();

        System.out.println("Inserire cifra: ");
        double cifra = scanner.nextDouble();

        scanner.close();

        boolean ok = false;

        if(operazione.charAt(0) == 'P')
        {
            if(cc.prelevi(cifra))
                ok = true;
        }
        else if (operazione.charAt(0) == 'V')
        {
            cc.versamento(cifra);
            ok = true;
        }
        else return;

        if(ok)
            System.out.println("Operazione conclusa con successo! Saldo: " + cc.getSaldo());
        else
            System.out.println("Operazione conclusa senza successo. Saldo: " + cc.getSaldo());

        scanner.close();
    }
}
