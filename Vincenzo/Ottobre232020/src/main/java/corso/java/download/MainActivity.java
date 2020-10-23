package corso.java.download;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tx = findViewById(R.id.TextView);
        UrlParser parser = new UrlParser(tx);
        String[] strings = new String[]{"https://google.it"};
        parser.execute(strings);
    }
}