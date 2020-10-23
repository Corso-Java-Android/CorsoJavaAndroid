package corso.java.tris;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Tris tris = null;
    Button[] buttons = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //9 Bottoni
        Button b1 = findViewById(R.id.button);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);
        Button b8 = findViewById(R.id.button8);
        Button b9 = findViewById(R.id.button9);
        Button reset = findViewById(R.id.button10);

        this.buttons = new Button[]{b1, b2, b3, b4, b5, b6, b7, b8, b9};
        this.tris = new Tris(buttons);

        //TextView aggiornabili
        TextView currentPlayer = findViewById(R.id.textView2);
        currentPlayer.setText("O");
        TextView Xscore = findViewById(R.id.textView5);
        TextView Oscore = findViewById(R.id.textView6);

        b1.setOnClickListener(new TrisClickListener(this.tris, b1, currentPlayer, Xscore, Oscore, 0, 0));
        b2.setOnClickListener(new TrisClickListener(this.tris, b2, currentPlayer, Xscore, Oscore, 0, 1));
        b3.setOnClickListener(new TrisClickListener(this.tris, b3, currentPlayer, Xscore, Oscore, 0, 2));
        b4.setOnClickListener(new TrisClickListener(this.tris, b4, currentPlayer, Xscore, Oscore, 1, 0));
        b5.setOnClickListener(new TrisClickListener(this.tris, b5, currentPlayer, Xscore, Oscore, 1, 1));
        b6.setOnClickListener(new TrisClickListener(this.tris, b6, currentPlayer, Xscore, Oscore, 1, 2));
        b7.setOnClickListener(new TrisClickListener(this.tris, b7, currentPlayer, Xscore, Oscore, 2, 0));
        b8.setOnClickListener(new TrisClickListener(this.tris, b8, currentPlayer, Xscore, Oscore, 2, 1));
        b9.setOnClickListener(new TrisClickListener(this.tris, b9, currentPlayer, Xscore, Oscore, 2, 2));
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tris.reset();
                Xscore.setText("0");
                Oscore.setText("0");
            }
        });

    }
}