package helloClassi;

public class Direttore extends Persona{

    public Direttore(String nome, String cognome) {
        super(nome, cognome);
    }

    @Override
    public String saluta() {
        return super.saluta() + " e sono un direttore";
    }

    public int emolumento()
    {
        return 80000;
    }
}
