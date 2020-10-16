package corso.java.todolist.model;

//import java.util.ArrayList;
import java.util.Calendar;

public class Task {
    public final String titolo;
    public final String descrizione;
    public final Calendar dataDiInizio;
    public final Calendar dataDiFine;
    //ArrayList<Task> sottoTasks;

    private Task(String titolo, String descrizione, Calendar dataDiInizio, Calendar dataDiFine) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.dataDiInizio = dataDiInizio;
        this.dataDiFine = dataDiFine;
    }

    @Override
    public String toString() {
        return "Task{" +
                "titolo='" + titolo + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", dataDiInizio=" + dataDiInizio +
                ", dataDiFine=" + dataDiFine +
                '}';
    }

    public static class Builder {
        private String titolo;
        private String descrizione;
        private Calendar dataDiInizio;
        private Calendar dataDiFine;

        public Builder withTitle(String title) {
            this.titolo = title;
            return this;
        }

        public Builder withDescrizione(String descrizione) {
            this.descrizione = descrizione;
            return this;
        }

        public Builder withInizio(Calendar inizio) {
            this.dataDiInizio = inizio;
            return this;
        }

        public Builder withFine(Calendar fine) {
            this.dataDiFine = fine;
            return this;
        }

        public Task build(){return new Task(titolo, descrizione, dataDiInizio, dataDiFine);}
    }
}
