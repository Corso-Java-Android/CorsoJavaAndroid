package corso.java.myblog;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public static class Metadata {
        public static int DB_VERSION = 1;
        public static final String DB_NAME = "myblog";

        public static final String POSTS_TABLE = "posts";

        public static class PostColumns {
            public static final String ID = "_id";
            public static final String USERID = "userId";
            public static final String TITLE = "title";
            public static final String BODY = "body";
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
                        Metadata.PostColumns.ID + " INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE," + // strong key o surrogate key
                        Metadata.PostColumns.USERID + " INTEGER," +
                        Metadata.PostColumns.TITLE + " TEXT NOT NULL," +
                        Metadata.PostColumns.BODY + " TEXT NOT NULL)";
        try {
            db.beginTransaction();
            db.execSQL(post_table);
            db.setTransactionSuccessful();
        } catch (Exception ex) {

        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
