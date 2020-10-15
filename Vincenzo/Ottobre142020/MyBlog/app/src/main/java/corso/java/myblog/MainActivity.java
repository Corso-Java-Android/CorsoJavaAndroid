package corso.java.myblog;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public  final static String TAG = "_MainActivity";
    public ArrayList<Post> posts = null;
    public Context MainActivity = null;
    public ListView list = null;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate di MainActivity");
        MainActivity = this;
        list = findViewById(R.id.listView);
        posts = makePosts();
        list.setAdapter(new ArrayAdapter<Post>(MainActivity, android.R.layout.simple_list_item_1, posts));
        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setTooltipText(getString(R.string.fabTxt));
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity, NewPostActivity.class);
                startActivityForResult(i, 0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent databack) {
        super.onActivityResult(requestCode, resultCode, databack);
        Bundle extra = databack.getExtras();
        posts.add(new Post(posts.size(), extra.getInt("id"), extra.getString("title"), extra.getString("body")));
        list.setAdapter(new ArrayAdapter<Post>(MainActivity, android.R.layout.simple_list_item_1, posts));
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