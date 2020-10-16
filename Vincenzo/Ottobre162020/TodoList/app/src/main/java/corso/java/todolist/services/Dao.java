package corso.java.todolist.services;

import android.database.Cursor;

public interface Dao<T> { // Data Access Object
    T create(T entity);
    Cursor read();
    T update(T entity, int key);
    T delete(int key);
}