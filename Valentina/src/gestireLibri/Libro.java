package gestireLibri;

public class Libro {

    // Attributi
    private String titolo;
    private String autore;
    private String editore = "";
    private int prezzo = 0;

    // Costruttori
    public Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    public Libro(String titolo, String autore, int prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
    }

    public Libro(String titolo, String autore, String editore) {
        this.titolo = titolo;
        this.autore = autore;
        this.editore = editore;
    }

    public Libro(String titolo, String autore, String editore, int prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.editore = editore;
        this.prezzo = prezzo;
    }

    // Metodi
    public String stampa()
    {
        return "Titolo: " + titolo + ", Autore: " + autore +
                ", Editore: " + editore + ", Prezzo: " + prezzo;
    }

    // get e set
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
}
