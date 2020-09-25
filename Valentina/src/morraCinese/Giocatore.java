package morraCinese;

import java.util.Random;
import java.util.Scanner;

public class Giocatore {
    private static int changeSeed = 0;

    public static int UMANO = 0;
    public static int PC = 1;
    private int tipoDiGiocatore;
    private int mossa;
    private Scanner scanner;
    private Random random;

    private int punteggio = 0;

    public Giocatore(int tipoDiGiocatore, Scanner scanner) {
        changeSeed++;

        this.scanner = scanner;

        // andrebbe gestito l'input
        if(tipoDiGiocatore != 0 && tipoDiGiocatore != 1)
            tipoDiGiocatore = PC;

        if(tipoDiGiocatore == PC)
            random = new Random(System.currentTimeMillis() + changeSeed);

        this.tipoDiGiocatore = tipoDiGiocatore;
    }

    public void incrementaPunteggio()
    {
        punteggio++;
    }

    private void mossaUmana()
    {
        System.out.println("Turno giocatore umano, inserire prossima mossa: CARTA(0), FORBICE(1), SASSO(2)");
        mossa = scanner.nextInt();

        // andrebbe gestito l'errore
        if(mossa < 0 || mossa >=3)
            mossa = 0;

    }

    private void mossaPc()
    {
//        Random random = new Random(System.currentTimeMillis()+n);

        mossa = random.nextInt(3);
    }

    public void mossa()
    {
        if(tipoDiGiocatore == UMANO)
            mossaUmana();
        else
            mossaPc();
    }

    public String getStringMossa()
    {
        switch (mossa)
        {
            case 0:
                return "CARTA";
            case 1:
                return "FORBICE";
            default:
                return "SASSO";
        }
    }

    public int getTipoDiGiocatore() {
        return tipoDiGiocatore;
    }

    public void setTipoDiGiocatore(int tipoDiGiocatore) {
        this.tipoDiGiocatore = tipoDiGiocatore;
    }

    public int getMossa() {
        return mossa;
    }

    public void setMossa(int mossa) {
        this.mossa = mossa;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }
}
