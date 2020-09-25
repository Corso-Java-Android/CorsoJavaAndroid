package helloClassi;

public class helloClassi {
    public static void main(String[] args) {
        Persona persona = new Persona("T", "Ting");
        Persona dipendente = new Dipendente("Lorenza", "Calamaio");
        Persona direttore = new Direttore("Sergio", "Polpette");

        System.out.println(persona);
        System.out.println(dipendente);
        System.out.println(direttore);

        System.out.println(persona.saluta());
        System.out.println(dipendente.saluta());
        System.out.println(direttore.saluta());

        if(dipendente instanceof Dipendente)
            System.out.println("Stipendio dipendente " + ((Dipendente)dipendente).stipendio());

        if(direttore instanceof Direttore)
            System.out.println("Emolumento direttore: " + ((Direttore) direttore).emolumento());
    }
}
