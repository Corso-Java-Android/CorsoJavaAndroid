package gestireLibri;

public class Driver {
    public static void main(String[] args) {
        Libro libro = new Libro("Herri Potteh", "Jk rowcol");
        System.out.println(libro.stampa());

        Libro libro1 = new Libro("Reti top-down", "Tipo di IT", 50);
        System.out.println(libro1.stampa());

        Libro libro2 = new Libro("Libro delle vacanze", "Insegnate", "Depre");
        System.out.println(libro2.stampa());

        Libro libro3 = new Libro("Mangia meno", "Nutrizionista", "Depre", 15);
        System.out.println(libro3.stampa());
    }
}
