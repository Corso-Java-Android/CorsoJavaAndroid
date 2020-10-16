package corso.java.myblog.services;

import android.database.Cursor;

public interface DAO<T> { // Data Access Object
    T create(T entity);
    Cursor read();
    T update(T entity, int key);
    T delete(int key);
}
