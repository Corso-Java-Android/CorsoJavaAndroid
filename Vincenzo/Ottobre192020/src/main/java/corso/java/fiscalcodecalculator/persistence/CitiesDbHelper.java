package corso.java.fiscalcodecalculator.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;

import androidx.annotation.Nullable;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import corso.java.fiscalcodecalculator.model.CityModel;

public class CitiesDbHelper extends SQLiteOpenHelper {

    public static class Metadata {
        public final static String DB_NAME = "fiscalcodegenerator";
        public final static int VERSION = 5;

        public static class Ddl {
            public final static String CREATE_CITIES =
                    "CREATE TABLE " + Tables.Cities.TABLE_NAME + "(" +
                            Tables.Cities.ID_COLUMN + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                            Tables.Cities.NAME_COLUMN + " TEXT NOT NULL," +
                            Tables.Cities.PROVINCE_COLUMN + " TEXT NOT NULL," +
                            Tables.Cities.ACRONYM_COLUMN + " TEXT NOT NULL," +
                            Tables.Cities.REGION_COLUMN + " TEXT," +
                            Tables.Cities.AREA_COLUMN + " TEXT," +
                            Tables.Cities.FC_COLUMN + " TEXT" +
                            ");";
        }

        public static class Tables {
            public static class Cities {
                public final static String TABLE_NAME = "cities";

                public final static String ID_COLUMN = "_id";
                public final static String NAME_COLUMN = "name";
                public final static String PROVINCE_COLUMN = "province";
                public final static String REGION_COLUMN = "region";
                public final static String ACRONYM_COLUMN = "acronym";
                public final static String AREA_COLUMN = "area";
                public final static String FC_COLUMN = "fc";
            }
        }
    }


    public CitiesDbHelper(@Nullable Context context) {
        super(context, Metadata.DB_NAME, null, Metadata.VERSION);
    }

    private static class LoadCitiesTask extends AsyncTask<Void, Void, List<CityModel>> {

        private final static String istatPermalink = "https://www.istat.it/storage/codici-unita-amministrative/Elenco-comuni-italiani.csv";

        @Override
        protected List<CityModel> doInBackground(Void... voids) {
            List<CityModel> list = new ArrayList<>();
            CityLoader loader = new CityLoader();
            try {
                URL url = new URL(istatPermalink);
                URLConnection conn = url.openConnection();
                list = loader.load(conn.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return list;
        }

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.beginTransaction();
        db.execSQL(Metadata.Ddl.CREATE_CITIES);
        db.setTransactionSuccessful();
        db.endTransaction();
        try {
            for (CityModel city : new LoadCitiesTask().execute().get()) {
                ContentValues cv = new ContentValues();
                cv.put(Metadata.Tables.Cities.ACRONYM_COLUMN, city.acronym);
                cv.put(Metadata.Tables.Cities.AREA_COLUMN, city.area);
                cv.put(Metadata.Tables.Cities.FC_COLUMN, city.fiscalCode);
                cv.put(Metadata.Tables.Cities.NAME_COLUMN, city.name);
                cv.put(Metadata.Tables.Cities.PROVINCE_COLUMN, city.province);
                cv.put(Metadata.Tables.Cities.REGION_COLUMN, city.region);
                db.insert(Metadata.Tables.Cities.TABLE_NAME, null, cv);
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + Metadata.Tables.Cities.TABLE_NAME);
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + Metadata.Tables.Cities.TABLE_NAME);
        onCreate(db);
    }
}
