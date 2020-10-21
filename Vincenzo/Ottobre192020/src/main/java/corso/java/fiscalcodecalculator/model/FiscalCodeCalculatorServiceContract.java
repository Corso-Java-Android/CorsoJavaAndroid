package corso.java.fiscalcodecalculator.model;

// Definizione del mondo in cui si calcolano i codici fiscali
public interface FiscalCodeCalculatorServiceContract {
    // operazioni possibili in questo mondo

    // operazione 1. Calcolo del codice fiscale
    // si tratta di un'operazione che, dato un input che rappresenta i dati anagrafici di una persona,
    // produce in output una stringa che ne rappresenta il codice fiscale
    String calculateFiscalCode(PersonalData input);
}
