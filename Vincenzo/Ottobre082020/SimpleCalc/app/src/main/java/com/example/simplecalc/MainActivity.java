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
        //Caselle di Testo
        TextView text1 = findViewById(R.id.oper1);
        text1.setText("0");
        TextView text2 = findViewById(R.id.oper2);
        text2.setText("0");

        //Listener
        somma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TEXT VIEW
                TextView text1 = findViewById(R.id.oper1);
                TextView text2 = findViewById(R.id.oper2);
                //VALORI IN TEXTVIEW
                String cont1 = text1.getText().toString();
                String cont2 = text2.getText().toString();
                if(cont1.length()==0||cont2.length()==0)
                    return;
                int oper1 = Integer.parseInt(cont1);
                int oper2 = Integer.parseInt(cont2);
                //SOMMA
                TextView risultato = findViewById(R.id.risultato);
                risultato.setText(""+(oper1+oper2));
            }
        });
        prodotto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TEXT VIEW
                TextView text1 = findViewById(R.id.oper1);
                TextView text2 = findViewById(R.id.oper2);
                //VALORI IN TEXTVIEW
                String cont1 = text1.getText().toString();
                String cont2 = text2.getText().toString();
                if(cont1.length()==0||cont2.length()==0)
                    return;
                int oper1 = Integer.parseInt(cont1);
                int oper2 = Integer.parseInt(cont2);
                //SOMMA
                TextView risultato = findViewById(R.id.risultato);
                risultato.setText(""+(oper1*oper2));
            }
        });

    }
}