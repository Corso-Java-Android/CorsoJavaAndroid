package helloClassi;

public class Dipendente extends Persona {

    public Dipendente(String nome, String cognome) {
        super(nome, cognome);
    }

    @Override
    public String saluta() {
        return super.saluta() + " e sono un dipendente";
    }

    @Override
    public String toString() {
        return "Dipendente: " + nome + " " + cognome;
    }

    public int stipendio() {
        return 1200;
    }
}
