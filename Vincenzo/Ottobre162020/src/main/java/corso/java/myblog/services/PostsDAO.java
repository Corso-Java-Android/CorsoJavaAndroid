package corso.java.myblog.services;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import corso.java.myblog.DbHelper;
import corso.java.myblog.model.Post;

public class PostsDAO extends BaseDao<Post> implements DAO<Post> {
    public PostsDAO(Context ctx) {
        super(ctx);
    }

    @Override
    public Post create(Post entity) {
        final String sql =
                // INSERT INTO posts(userId, title, body) VALUES (?, ?, ?);"
                "INSERT INTO " + DbHelper.Metadata.POSTS_TABLE + "(" +
                        DbHelper.Metadata.PostColumns.USERID + "," +
                        DbHelper.Metadata.PostColumns.TITLE + "," +
                        DbHelper.Metadata.PostColumns.BODY + ")" +
                        " VALUES(?, ?, ?);";
        SQLiteDatabase db = helper.getWritableDatabase();
        Object[] params =
                new Object[] { entity.userId, entity.title, entity.body };
        db.execSQL(sql, params);
        return entity;
    }

    @Override
    public Cursor read() {
        SQLiteDatabase db = helper.getReadableDatabase();
        // SELECT * FROM posts
        return db.query(
                DbHelper.Metadata.POSTS_TABLE,
                null,
                null,
                null,
                null,
                null,
                null);
    }

    @Override
    public Post update(Post entity, int key) {
        return null;
    }

    @Override
    public Post delete(int key) {
        return null;
    }
}
