package corso.java.todolist.services;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import corso.java.todolist.DbHelper;
import corso.java.todolist.model.Task;

public class TaskDao extends BaseDao<Task> implements Dao<Task> {

    public TaskDao(Context ctx) {
        super(ctx);
    }

    @Override
    public Task create(Task entity) {
        final String sql =
                // INSERT INTO posts(userId, title, body) VALUES (?, ?, ?);"
                "INSERT INTO " + DbHelper.Metadata.POSTS_TABLE + "(" +
                        DbHelper.Metadata.PostColumns.TITOLO + "," +
                        DbHelper.Metadata.PostColumns.DESCRIZIONE + "," +
                        DbHelper.Metadata.PostColumns.DATADIINIZIO + "," +
                        DbHelper.Metadata.PostColumns.DATADIFINE + ")" +
                        " VALUES(?, ?, ?);";
        SQLiteDatabase db = helper.getWritableDatabase();
        Object[] params =
                new Object[] { entity.titolo, entity.descrizione, entity.dataDiInizio, entity.dataDiFine };
        db.execSQL(sql, params);
        return entity;
    }

    @Override
    public Cursor read() {
        SQLiteDatabase db = helper.getReadableDatabase();
        // SELECT * FROM posts
        return db.query(
                DbHelper.Metadata.POSTS_TABLE,
                new String[] {
                        DbHelper.Metadata.PostColumns.TITOLO,
                        DbHelper.Metadata.PostColumns.DESCRIZIONE,
                        DbHelper.Metadata.PostColumns.DATADIINIZIO,
                        DbHelper.Metadata.PostColumns.DATADIFINE
                },
                null,
                null,
                null,
                null,
                null);
    }

    @Override
    public Task update(Task entity, int key) {
        return null;
    }

    @Override
    public Task delete(int key) {
        return null;
    }
}
