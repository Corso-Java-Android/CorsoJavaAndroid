package corso.java.todolist.services;

import android.content.Context;

import corso.java.todolist.DbHelper;

public abstract class BaseDao<T> implements Dao<T> {
    protected DbHelper helper;

    public BaseDao(Context ctx) {
        helper = new DbHelper(ctx);
    }
}
