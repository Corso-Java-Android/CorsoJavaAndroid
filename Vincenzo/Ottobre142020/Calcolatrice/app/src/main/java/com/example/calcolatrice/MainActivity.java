package com.example.calcolatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Calcolatrice cal = null;
    TextView tx = null;
    ListView list = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TEXT VIEW DISPLAY
        tx = findViewById(R.id.textView);
        tx.setText("0");
        //LIST VIEW
        list = findViewById(R.id.listView);
        
        //Calcolatrice vera e propria
        cal = new Calcolatrice(list, this);
        //BOTTONI NUMERICI
        final Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new NumberClickListener(button1, cal, tx));
        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new NumberClickListener(button2, cal, tx));
        final Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new NumberClickListener(button3, cal, tx));
        final Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new NumberClickListener(button4, cal, tx));
        final Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new NumberClickListener(button5, cal, tx));
        final Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new NumberClickListener(button6, cal, tx));
        final Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new NumberClickListener(button7, cal, tx));
        final Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new NumberClickListener(button8, cal, tx));
        final Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new NumberClickListener(button9, cal, tx));
        final Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new NumberClickListener(button10, cal, tx));
        //BOTTONI DELLE OPERAZIONI
        final Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(""+cal.inversione());
            }
        });
        final Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.decimal();
            }
        });
        final Button button13 = findViewById(R.id.button13);
        button13.setOnClickListener(new SignClickListener(button13, cal, tx));
        final Button button14 = findViewById(R.id.button14);
        button14.setOnClickListener(new SignClickListener(button14, cal, tx));
        final Button button15 = findViewById(R.id.button15);
        button15.setOnClickListener(new SignClickListener(button15, cal, tx));
        final Button button16 = findViewById(R.id.button16);
        button16.setOnClickListener(new SignClickListener(button16, cal, tx));
        final Button button17 = findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Double res = cal.esegui();
                    tx.setText(""+res);
                }catch(ArithmeticException e){
                    tx.setText(e.getMessage());
                }finally {cal.reset();}
            }
        });
        final Button button18 = findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(cal.cancella());
            }
        });
        final Button button19 = findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.reset();
                tx.setText("0");
            }
        });
        final Button button20 = findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.resetList();
            }
        });
    }
}