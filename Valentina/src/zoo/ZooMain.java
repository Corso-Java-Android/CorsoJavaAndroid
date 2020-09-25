package zoo;

public class ZooMain {
    public static void main(String[] args) {
        Animale animale = new Animale("SciacquaLattuga");
        System.out.println(animale.mangia());
        System.out.println(animale.dorme());

        System.out.println("----------------------------------");

        Leone simba = new Leone("Simba");
        System.out.println(simba.mangia());
        System.out.println(simba.dorme());

        System.out.println("----------------------------------");

        Gazzella gazz = new Gazzella("Max");
        System.out.println(gazz.mangia());
        System.out.println(gazz.dorme());

        System.out.println("----------------------------------");

        System.out.println(simba.ruggisce());
        System.out.println(gazz.scappa());
        System.out.println(gazz.mangia());

        System.out.println("----------------------------------");
    }
}
