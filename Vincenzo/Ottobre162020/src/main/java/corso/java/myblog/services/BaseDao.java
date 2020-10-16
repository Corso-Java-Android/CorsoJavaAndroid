package corso.java.myblog.services;

import android.content.Context;

import corso.java.myblog.DbHelper;

public abstract class BaseDao<T> implements DAO<T> {
    protected DbHelper helper;

    public BaseDao(Context ctx) {
        helper = new DbHelper(ctx);
    }
}
