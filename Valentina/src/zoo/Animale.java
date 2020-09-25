package zoo;

public class Animale {
    protected String nome;

    public Animale(String nome) {
        this.nome = nome;
    }

    public String mangia()
    {
        return this.nome + " sta mangiando...";
    }

    public String dorme()
    {
        return this.nome + " sta dormendo...";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
