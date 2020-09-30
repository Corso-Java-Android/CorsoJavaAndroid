package nominativi_casuali;

import java.util.Random;

public class OrdineCasualeGenerator {

    /*
        a partire dall'elenco dei nominativi
        generare l'ordine casuale dei nominativi stessi
        no nominativi doppi, ovvero se un nominativo già in output no reprint
     */

    private static String[] creteNames()
    {
        return new String[]{
        "Alessio Angelo Liotta"
        ,"Davide Pasquali"
        ,"Enrico Macrì"
        ,"Tommaso Segato"
        ,"Daniele Vittore"
        ,"Danis Moretta"
        ,"Erika Corallo"
        ,"Gabriele Lo Piccolo"
        ,"Giovanni Battista Cortese"
        ,"Karol Khaira"
        ,"Olivia Nadia Djeugove"
        ,"Sara Vizzaclaro"
        ,"Valentina De Miglio"
        ,"Vincenzo Santoro"};
    }

    private static void swap(String[] names, int index1, int index2)
    {
        String o3 = names[index1];
        names[index1] = names[index2];
        names[index2] = o3;
    }

    public static void main(String[] args) {
        String[] names = creteNames();
        Random random = new Random(System.currentTimeMillis());

        int dimension = names.length;

        // if you don't want modify names
        // String[] names2 = names.clone();

        for(int i=0; i<names.length; i++) {
            System.out.print("[" + (i+1) + "] ");
            int index = random.nextInt(dimension);
            System.out.println(names[index]);

            swap(names, index, dimension-1);

            dimension--;
        }
    }
}
