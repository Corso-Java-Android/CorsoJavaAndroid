package helloClassi;

public class Persona {
    protected String nome;
    protected String cognome;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String saluta()
    {
        return "Ciao sono " + nome;
    }

    @Override
    public String toString() {
        return "Mi chiamo " + nome + ' ' + cognome;
    }

    //...
}
