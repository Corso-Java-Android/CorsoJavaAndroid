package corso.java.todolist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public static class Metadata {
        public static int DB_VERSION = 1;
        public static final String DB_NAME = "todolist";

        public static final String POSTS_TABLE = "tasks";

        public static class PostColumns {
            public static final String TITOLO = "_titolo";
            public static final String DESCRIZIONE = "userId";
            public static final String DATADIINIZIO = "datadiinizio";
            public static final String DATADIFINE = "datadifine";
        }
    }

    public DbHelper(@Nullable Context context) {
        super(context, Metadata.DB_NAME, null, Metadata.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Comandi DDL per la creazione delle tabelle
        final String post_table =
                "CREATE TABLE " + Metadata.POSTS_TABLE + "(" +
                        Metadata.PostColumns.TITOLO + " TEXT," + // strong key o surrogate key
                        Metadata.PostColumns.DESCRIZIONE + " TEXT," +
                        Metadata.PostColumns.DATADIINIZIO + " TEXT NOT NULL," +
                        Metadata.PostColumns.DATADIFINE + " TEXT NOT NULL)";
        try {
            db.beginTransaction();
            db.execSQL(post_table);
            db.setTransactionSuccessful();
        } catch (Exception ex) {

        }
        finally {
            db.endTransaction();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
