package morraCinese;

import java.util.Random;
import java.util.Scanner;

public class MorraCinese {

    // Attributi
    private Giocatore giocatore1;
    private Giocatore giocatore2;
    private int maxPunteggio = 5;
    private Scanner scanner;

    private boolean endGame = false;

    // Costruttori
    public MorraCinese(int maxPunteggio, Scanner scanner)
    {
        this.maxPunteggio = maxPunteggio;
        System.out.println("Morra Cinese! Scegli due tipi di giocatori: UMANO(0), PC(1)");
        this.scanner = scanner;
        giocatore1 = new Giocatore(scanner.nextInt(), scanner);
        giocatore2 = new Giocatore(scanner.nextInt(), scanner);
    }

    // restituisce il giocatore che ha vinto
    private Giocatore valutaMosse()
    {
        // esempio:
        /*
            se il giocatore1 gioca FORBICE (valore 1) e il giocatore2 SASSO (valore 2)

            sappiamo che il giocatore2 vince.

            SASSO (2) sarà uguale a il valore di FORBICE(1) + 1
         */

        // carta 0, forbice 1, sasso 2

        if(giocatore2.getMossa() == (giocatore1.getMossa() + 1)%3) {
            System.out.println("Vince il turno il giocatore 2");
            return giocatore2;
        }
        else if (giocatore1.getMossa() == giocatore2.getMossa())
        {
            System.out.println("Pareggio!");
            return null;
        }
        System.out.println("Vince il il turno giocatore 1.");
        return giocatore1;
    }

    private void giocanoMosse()
    {
        giocatore1.mossa();
        giocatore2.mossa();

        System.out.println("Il giocatore 1 gioca: " + giocatore1.getStringMossa());
        System.out.println("Il giocatore 2 gioca: " + giocatore2.getStringMossa());
    }

    private void controllaSeRaggiuntoIlMax()
    {
        if(giocatore1.getPunteggio() == maxPunteggio) {
            System.out.println("Vince il giocatore 1!");
            endGame = true;
        }
        if(giocatore2.getPunteggio() == maxPunteggio) {
            System.out.println("Vince il giocatore 2!");
            endGame = true;
        }
    }

    public void gioca()
    {
        if(endGame) {
            System.out.println("Gioco finito!");
            return;
        }

        giocanoMosse();

        Giocatore vincente = valutaMosse();
        if(vincente != null)
            vincente.incrementaPunteggio();

        controllaSeRaggiuntoIlMax();

        System.out.println("Giocatore1 vs Giocatore2: " + giocatore1.getPunteggio() + "-" +
                giocatore2.getPunteggio());
    }

    public boolean isEndGame() {
        return endGame;
    }
}
