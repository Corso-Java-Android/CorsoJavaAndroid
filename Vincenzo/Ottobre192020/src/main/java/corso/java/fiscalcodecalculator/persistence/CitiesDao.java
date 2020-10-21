package corso.java.fiscalcodecalculator.persistence;

import android.content.ContentValues;
import android.database.Cursor;

/**
 * Operazioni che posso fare sui dati di tipo CITTA'.
 */
public interface CitiesDao {
    /**
     * Inserimento di dati nella tabella delle città.
     * @param cv i dati da inserire.
     */
    void insert(ContentValues cv);

    /**
     * Query sulla tabella delle città.
     * @param projection elenco dei campi da restituire
     * @param selection filtro WHERE
     * @param params parametri per il filtro
     * @param sortOrder espressione per l'ordinamento
     * @return un cursore con i record selezionati.
     */
    Cursor query(String[] projection, String selection, String[] params, String sortOrder);

    /**
     * Ottiene l'elenco delle province.
     * @return l'elenco delle province.
     */
    Cursor getProvinces();
}
