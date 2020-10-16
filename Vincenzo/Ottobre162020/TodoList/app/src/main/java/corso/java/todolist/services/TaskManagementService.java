package corso.java.todolist.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import corso.java.todolist.model.Task;

public class TaskManagementService {
    private static final String TAG = "TaskManagement";
    private static List<Task> taskList = new ArrayList<>();

    private static long lastId = 0;

    public static long getNextId() {
        return ++lastId;
    }

    public List<Task> readAll() {
        return taskList;
    }

    public Task get(String titolo) {
        Task result = null;
        Iterator<Task> e = taskList.iterator();
        while (result == null && e.hasNext()) {
            Task p = e.next();
            if (titolo == p.titolo) result = p;
        }
        return result;
    }

    public void add(Task t) {
        taskList.add(t);
    }
}
