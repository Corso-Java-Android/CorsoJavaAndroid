package corso.java.textdownloader;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.UrlQuerySanitizer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;

import corso.java.textdownloader.services.Downloader;
import corso.java.textdownloader.services.DownloaderImpl;

public class MainActivity extends AppCompatActivity {
    public class AsyncDownloader extends AsyncTask<String, Integer, String> {
        @Override
        protected String doInBackground(String... addresses) {
            try (InputStream s = new URL(addresses[0]).openConnection().getInputStream()) {
                Downloader d = new DownloaderImpl();
                return d.load(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView view = findViewById(R.id.text_viewer);
        view.setMovementMethod(new ScrollingMovementMethod());
        AsyncDownloader d = new AsyncDownloader();
        try {
            view.setText(d.execute("https://google.it").get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}