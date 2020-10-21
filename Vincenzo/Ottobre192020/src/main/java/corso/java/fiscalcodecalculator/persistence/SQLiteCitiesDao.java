package corso.java.fiscalcodecalculator.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;

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
        return helper.getReadableDatabase().query(
                true,
                CitiesDbHelper.Metadata.Tables.Cities.TABLE_NAME,
                projection,
                selection,
                params,
                null, null,
                sortOrder,
                null
        );
    }

    @Override
    public Cursor getProvinces() { // SELECT DISTINCT acronym AS _id, province FROM cities ORDER BY acronym
        return query(
                new String[]{CitiesDbHelper.Metadata.Tables.Cities.ACRONYM_COLUMN + " AS _id", CitiesDbHelper.Metadata.Tables.Cities.PROVINCE_COLUMN},
                null, null, "_id");
    }

    public Cursor getCitiesFromProvince(String province){
        return query(
                new String[]{CitiesDbHelper.Metadata.Tables.Cities.NAME_COLUMN + " AS _id", CitiesDbHelper.Metadata.Tables.Cities.PROVINCE_COLUMN},
                province, null, "_id");
        //return query()
    }
}
