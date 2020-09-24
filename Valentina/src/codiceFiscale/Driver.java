package codiceFiscale;

/*
Dato in input un codice fiscale:
es. NNNCCC 66C11 C111C
estrarre dalla 7 (6 pos) cifra alla 11 (10 pos):

Giorno di nascita
Mese di nascita
Anno di nascita
Sesso
Eta

Controllare se è 16 cifre
 */

public class Driver {
    public static void main(String[] args) {
        CodiceFiscale codiceFiscale = new CodiceFiscale("NNNCCC66C11C111C");
        System.out.println(codiceFiscale);
    }
}
