package corso.java.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Sconfitta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sconfitta);

        Bundle bundle = getIntent().getExtras();
        TextView tx = findViewById(R.id.textView3);
        tx.setText("Il numero era "+bundle.getInt("Numero"));
    }
}