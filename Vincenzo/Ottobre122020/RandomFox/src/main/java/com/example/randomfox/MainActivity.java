package com.example.randomfox;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {
    public static TextView foxName = null;
    public static ImageView imgFox = null;
    public static FoxApodObject fao = null;
    public static final String FOX_URL = "https://randomfox.ca/floof/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.foxName = findViewById(R.id.txtFox);
        this.imgFox = findViewById(R.id.imgFox);
        Button bt = findViewById(R.id.btFox);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retrieveDataFromInternet();
            }
        });
    }

    private void retrieveDataFromInternet() {
        FoxJsonRetriever fjr = new FoxJsonRetriever();
        fjr.execute(FOX_URL);
    }

    private class FoxJsonRetriever extends AsyncTask<String, Void, String> {
        private static final String TAG = "FoxJsonRetriever";

        @Override
        protected String doInBackground(String... params) {
            Log.d(TAG, "doInBackground: " + params[0]);
            Log.d(TAG, "doInBackground: #parametri=" + params.length);
            return downloadData(params[0]);
        }

        private String downloadData(String path) {

            URL url = null;
            URLConnection connection = null;
            InputStream is = null;
            InputStreamReader ir = null;
            BufferedReader reader = null;

            StringBuilder json = new StringBuilder();

            try {
                // connessioni e sorgenti di dati
                url = new URL(path);
                connection = url.openConnection();
                is = connection.getInputStream();
                ir = new InputStreamReader(is);
                reader = new BufferedReader(ir);

                // leggere i dati
                char [] buffer = new char[2048];
                int nreads = reader.read(buffer);
                while(nreads > 0) {
                    json.append(buffer, 0, nreads); // compongo la string in uscita pezzo per pezzo
                    nreads = reader.read(buffer);
                }


            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try { reader.close(); } catch(Throwable t) {}
                try { ir.close(); } catch(Throwable t) {}
                try { is.close(); } catch(Throwable t) {}
            }

            return json.toString();
        }

        @Override
        protected void onPostExecute(String jsonString) {
            JSONObject jo = null;
            FoxApodObject fao = null;

            try {
                jo = new JSONObject(jsonString);
                fao = new FoxApodObject(
                        jo.getString("image"),
                        jo.getString("link")
                );
                Log.d(TAG, "onPostExecute: jsono="+fao);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            MainActivity.foxName.setText(fao.getLink());
            MainActivity.this.fao = fao;

            DownloadImageTask dit = new DownloadImageTask();
            dit.execute(fao.getImage());
        }
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected Bitmap doInBackground(String... urls) {
            Bitmap bitmap = null;
            InputStream is = null;
            try {
                is = new URL(urls[0]).openStream();
                bitmap = BitmapFactory.decodeStream(is);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {is.close();}catch(Throwable t) {}
            }
            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            MainActivity.this.fao.setBitmap(bitmap);
            MainActivity.this.imgFox.setImageBitmap(bitmap);
        }
    }

}
