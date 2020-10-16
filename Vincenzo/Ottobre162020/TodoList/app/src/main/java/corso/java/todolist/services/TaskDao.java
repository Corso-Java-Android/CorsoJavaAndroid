package corso.java.todolist.services;

import android.content.Context;
import android.database.Cursor;

import corso.java.todolist.model.Task;

public class TaskDao extends BaseDao<Task> implements Dao<Task> {

    public TaskDao(Context ctx) {
        super(ctx);
    }

    @Override
    public Task create(Task entity) {
        return null;
    }

    @Override
    public Cursor read() {
        return null;
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
