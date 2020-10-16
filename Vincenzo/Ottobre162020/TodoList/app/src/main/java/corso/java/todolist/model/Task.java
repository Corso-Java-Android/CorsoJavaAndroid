package corso.java.todolist.model;

import java.util.ArrayList;
import java.util.Calendar;

public class Task {
    String titolo;
    String descrizione;
    Calendar dataDiInizio;
    Calendar dataDiFine;
    ArrayList<Task> sottoTasks;

}
