package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bottoni
        Button somma = findViewById(R.id.button);
        Button prodotto = findViewById(R.id.button2);
        Button sottrazione = findViewById(R.id.button3);
        Button quoziente = findViewById(R.id.button4);

        //Caselle di Testo
        TextView text1 = findViewById(R.id.oper1);
        text1.setText("0");
        TextView text2 = findViewById(R.id.oper2);
        text2.setText("0");
        TextView risultato = findViewById(R.id.risultato);

        //Listener
        somma.setOnClickListener(new MathClickListener(text1, text2, risultato,"+"));
        prodotto.setOnClickListener(new MathClickListener(text1, text2, risultato, "x"));
        sottrazione.setOnClickListener(new MathClickListener(text1, text2, risultato,"-"));
        quoziente.setOnClickListener(new MathClickListener(text1, text2, risultato,":"));

    }
}