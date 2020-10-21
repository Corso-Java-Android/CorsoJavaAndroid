package corso.java.fiscalcodecalculator.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

/**
 * Implementazione del DAO su SQLite.
 * Classe di facciata - Façade
 * semplifica l'utilizzo della classe CitiesDbHelper
 */
public class SQLiteCitiesDao implements CitiesDao {
    /**
     * Helper per l'accesso al database.
     */
    private final CitiesDbHelper helper;

    /**
     * Costruttore.
     *
     * @param context contesto di applicazione.
     */
    public SQLiteCitiesDao(Context context) {
        helper = new CitiesDbHelper(context); // inizializzo l'helper
    }

    /**
     * Inserimento di una città.
     *
     * @param cv campi da inserire.
     */
    @Override
    public void insert(ContentValues cv) {
        helper.getWritableDatabase().insert(CitiesDbHelper.Metadata.Tables.Cities.TABLE_NAME, null, cv);
    }

    /**
     * Effettua una query sul db SQLite.
     *
     * @param projection elenco dei campi da restituire
     * @param selection  filtro WHERE
     * @param params     parametri per il filtro
     * @param sortOrder  espressione per l'ordinamento
     * @return restituisce un cursore che riflette la selezione richiesta.
     */
    @Override
    public Cursor query(String[] projection, String selection, String[] params, String sortOrder) {
        // SELECT
        //     DISTINCT (1)
        //     projection - elenco di campi - fields list (3)
        // FROM TABLE_NAME (2)
        // WHERE selection (4) & parameters (5)
        // -- selection = "field1 = ? AND field2 = ? OR field3 = ?
        // -- parameters array i cui valori sostituiscono i valori al posto del ? nell'ordine di presentazione all'interno della selezione!
        // GROUP BY grouping expression (6)
        // HAVING grouping filtering
        // ORDER BY fields list (8)
        // LIMIT page size (9)
        return helper.getReadableDatabase().query(
                true, // (1)
                CitiesDbHelper.Metadata.Tables.Cities.TABLE_NAME, // (2)
                projection, // (3)
                selection, // (4)
                params, // (5)
                null, // (6)
                null, // (7)
                sortOrder, // (8)
                null // (9)
        );
    }

    @Override
    public Cursor getProvinces() { // SELECT DISTINCT acronym AS _id, province FROM cities ORDER BY acronym
        return query(
                new String[]{CitiesDbHelper.Metadata.Tables.Cities.ACRONYM_COLUMN + " AS _id", CitiesDbHelper.Metadata.Tables.Cities.PROVINCE_COLUMN},
                null, null, "_id");
    }
}
