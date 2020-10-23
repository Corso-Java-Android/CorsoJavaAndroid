package corso.java.download;

import android.os.AsyncTask;
import android.widget.TextView;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlParser extends AsyncTask<String, Void, String> {

    TextView tx = null;

    public UrlParser(TextView tx){
        this.tx = tx;
    }

    @Override
    protected String doInBackground(String... strings) {
        String url = strings[0];
        StringBuilder builder = new StringBuilder();
        BufferedInputStream inputStream = null;
        BufferedInputStream bis = null;
        InputStreamReader read = null;
        BufferedReader br = null;
        try {
            inputStream = new BufferedInputStream(new URL(url).openStream());
            bis = new BufferedInputStream(inputStream);
            read = new InputStreamReader(bis);
            br = new BufferedReader(read);
            String value = br.readLine();
            while (value!=null) {
                builder.append(value);
                value = br.readLine();
            }
            br.close();
            read.close();
            bis.close();
            inputStream.close();
        } catch (IOException e) {
            // handles IO exceptions
        }

        return builder.toString();
    }

    @Override
    protected void onPostExecute(String result) {
        tx.setText(result);
    }

}
