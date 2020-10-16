package corso.java.myblog.services;

import android.util.Log;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import corso.java.myblog.model.Post;

public class PostManagementService {
    private static final String TAG = "PostManagement";
    private static List<Post> postList = new ArrayList<>();

    private static long lastId = 0;

    public static long getNextId() {
        return ++lastId;
    }

    public List<Post> readAll() {
        return postList;
    }

    public Post get(long id) {
        Post result = null;
        Iterator<Post> e = postList.iterator();
        while (result == null && e.hasNext()) {
            Post p = e.next();
            if (id == p.id) result = p;
        }
        return result;
    }

    public void add(Post p) {
        postList.add(p);
    }
}
