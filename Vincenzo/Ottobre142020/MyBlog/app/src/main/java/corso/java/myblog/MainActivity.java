package corso.java.myblog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public  final static String TAG = "_MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate di MainActivity");
        ListView list = findViewById(R.id.listView);
        list.setAdapter(new ArrayAdapter<Post>(this, android.R.layout.simple_list_item_1, makePosts()));
    }

    private ArrayList<Post> makePosts() {
        ArrayList<Post> posts = new ArrayList<Post>();
        Random rand = new Random();
        int numPosts = 1+rand.nextInt(20);
        for(int i=0; i<numPosts; i++){
            posts.add(new Post(i, rand.nextLong(), randTitle(rand), randBody(rand)));
        }
        return posts;
    }

    private String randTitle(Random rand) {
        int i = rand.nextInt(3);
        if(i==0)
            return "La Divina Commedia";
        else if(i==1)
            return "Lorem Ipsum";
        else return "Buongiorno";
    }

    private String randBody(Random rand) {
        int i = rand.nextInt(3);
        if(i==0)
            return "Nel mezzo del cammin di nostra vita mi ritrovai per una selva oscura, ché la diritta via era smarrita. ";
        else if(i==1)
            return "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla bibendum placerat lectus in volutpat. Nullam a neque enim. Nullam dictum elit et leo ornare, at malesuada metus iaculis. Donec mattis in augue nec vestibulum. Fusce vel tempor lacus. Nunc ultrices arcu elit, eu dapibus velit cursus at. Aliquam fringilla velit velit, ac pulvinar tortor ultrices vel. Integer sed hendrerit massa, sit amet cursus enim. Sed aliquet dapibus ipsum non ultrices.";
        else return "Buongiorno a tutti!";
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart di MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause di MainActivity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart di MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop di MainActivity");
    }
}