package com.example.a004;

import android.os.AsyncTask;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private static final String NASA_URL = "https://api.nasa.gov/planetary/apod?api_key=JRMGEMheIjAmpW8lAbYZhDWNxOyGSowO3MicFXai";

    private TextView txtLink;
    private TextView txtDescription;
    private ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                retrieveDataFromInternet();
                /*
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                 */
            }
        });

        this.txtLink = findViewById(R.id.txtLink);
        this.txtDescription = findViewById(R.id.txtDescription);
        this.imgView = findViewById(R.id.imgView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void retrieveDataFromInternet() {
        NasaJsonRetriever njr = new NasaJsonRetriever();
        njr.execute(NASA_URL);
    }

    //
    // inner class di MainActivity
    //
    private class NasaJsonRetriever extends AsyncTask<String, Void, String> {
        private static final String TAG = "LavoroParallelo";

        @Override
        protected String doInBackground(String... params) {
            Log.d(TAG, "doInBackground: " + params[0]);
            Log.d(TAG, "doInBackground: #parametri=" + params.length);
            // LEGGERE DATI DA INTERNET
            return "Dati da Internet Letti OK";
        }

        @Override
        protected void onPostExecute(String s) {
            MainActivity.this.txtDescription.setText(s);
            Log.d(TAG, "onPostExecute: Risulato=" + s);
        }
    }



}
