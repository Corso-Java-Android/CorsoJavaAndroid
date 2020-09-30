package nominativi_casuali_2;

import java.util.*;

public class OrdineCasualeGeneratorList {

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
        String[] n = creteNames();

        List<String> names = new ArrayList<String>(Arrays.asList(n.clone()));
        Random random = new Random(System.currentTimeMillis());

        int i = 0;
        while (!names.isEmpty()){
            System.out.print("[" + (i+1) + "] ");
            int index = random.nextInt(names.size());
            System.out.println(names.get(index));

            names.remove(index);

            i++;
        }

        System.out.println("-----------------------------------");

        List<String> names2 = new ArrayList<String>(Arrays.asList(n.clone()));

        int dimension = names2.size();
        for(i=0; i<names2.size(); i++) {
            System.out.print("[" + (i+1) + "] ");
            int index = random.nextInt(dimension);
            System.out.println(names2.get(index));

            Collections.swap(names2, index, dimension-1);

            dimension--;
        }

        System.out.println("-----------------------------------");

        List<String> names3 = new ArrayList<String>(Arrays.asList(n.clone()));
        Collections.shuffle(names3);
        names3.forEach(x -> System.out.println("[" + (names3.indexOf(x)+1) + "] " + x));
    }
}
