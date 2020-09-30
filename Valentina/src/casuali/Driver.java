package casuali;

public class Driver {

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

    public static void main(String[] args) {
        String[] names = creteNames();
        CasualOrder casualOrder = new CasualOrder(names, names.length);

//        for(int i = 0; i < 10; i++){
            casualOrder.printCasual();
//            System.out.println("----------------------");
//        }
    }
}
