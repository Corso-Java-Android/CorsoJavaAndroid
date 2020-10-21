package corso.java.fiscalcodecalculator.providers;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

import corso.java.fiscalcodecalculator.persistence.CitiesDao;
import corso.java.fiscalcodecalculator.persistence.CitiesDbHelper;
import corso.java.fiscalcodecalculator.persistence.SQLiteCitiesDao;

// Un ContentProvider è un DAO (Data Access Object)
// perché ci mette a disposizione le 4 operazioni CRUD
// Create -> insert
// Read -> query
// Update -> update
// Delete -> delete
public class CitiesContentProvider extends ContentProvider {

    // definizione degli URI gestiti dal ContentProvider
    // URI: schema://authority/path
    // ContentProvider URI: content://AUTHORITY/operazione/da/effettuare
    public final static String AUTHORITY = "corso.java.fiscalcodecalculator";
    // all'interno del mio provider voglio prevedere queste operazioni
    // recupero di tutte le province: content://AUTHORITY/provinces (1)
    // recupero di tutte le città di una provincia: content://AUTHORITY/citiesof/NOME_PROVINCIA_DESIDERATA (2)
    public final static String PROVINCES_PATH = "provinces";
    public final static String CITIES_PATH = "cities";

    // SCHEMA_CONTENT = "content"
    // AUTHORITY = "corso.java.fiscalcodecalculator"
    // PROVINCES_PATH = "provinces"
    // PROVINCES_CONTENT_URI = "content://corso.java.fiscalcodecalculator/provinces"
    public final static Uri PROVINCES_CONTENT_URI = // (1)
            Uri.parse(ContentResolver.SCHEME_CONTENT + "://" + AUTHORITY + "/" + PROVINCES_PATH);
    public final static Uri CITIES_CONTENT_URI =
            Uri.parse(ContentResolver.SCHEME_CONTENT + "://" + AUTHORITY + "/" + CITIES_PATH);

    // ogni operazione del provider produce un risultato diverso, specificato ancora con
    // una stringa univoca, custom, scelta dal programmatore
    // definizione delle tipologie di dato gestite
    public final static String PROVINCES_CONTENT_TYPE = "fc.provinces"; // [*]
    public final static String CITIES_CONTENT_TYPE = "fc.cities";

    // definizione delle operazioni che possiamo effettuare con gli URI passati
    // è prassi associare ad ognuno degli URI una costante numerica per facilitare
    // le operazioni di discriminazione di cosa fare...
    private final static int OPERATION_PROVINCES_LIST = 1;
    private final static int OPERATION_CITIES_LIST = 2;

    // questo oggetto serve per la gestione degli URI e la loro interpretazione
    private final static UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);

    // blocco di inizializzazione statico - eseguito alla partenza dell'app
    static {
        // associo (1) a OPERATION_PROVINCES_LIST
        matcher.addURI(AUTHORITY, PROVINCES_PATH, OPERATION_PROVINCES_LIST);
        matcher.addURI(AUTHORITY, CITIES_PATH, OPERATION_CITIES_LIST);
    }

    // questo oggetto E' RESPONSABILE DI EFFETTUARE REALMENTE LE OPERAZIONI
    private CitiesDao dao;

    public CitiesContentProvider() {
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        // Implement this to handle requests to delete one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Restituisce il tipo di dato (come definito in [*]) specificato nell'URI passato come
     * parametro
     *
     * @param uri URI da interpretare
     * @return il tipo di dato restituito da questo URI
     */
    @Override
    public String getType(Uri uri) {
        switch (matcher.match(uri)) {
            case OPERATION_PROVINCES_LIST:
                return PROVINCES_CONTENT_TYPE; // [*]
            case OPERATION_CITIES_LIST:
                return CITIES_CONTENT_TYPE;
        }
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        // TODO: Implement this to handle requests to insert a new row.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean onCreate() {
        dao = new SQLiteCitiesDao(getContext()); // TODO: Questa new non mi piace.
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        switch (matcher.match(uri)) {
            case OPERATION_PROVINCES_LIST: // se sono arrivato qui è stato richiesto un elenco di province
                return dao.getProvinces();
            case OPERATION_CITIES_LIST:
                return dao.query(projection, selection, selectionArgs, sortOrder);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        // TODO: Implement this to handle requests to update one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
