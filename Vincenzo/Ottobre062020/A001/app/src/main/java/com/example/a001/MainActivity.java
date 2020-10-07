package com.example.a001;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static final String KEY = "Contatore dell'applicazione";
    private int contatore = 0;


    private static final String tag = "*** MainActivity()";

    public MainActivity() {
        super();
        Log.d(tag, "000 - Costruttore in azione");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null) {
            this.contatore = savedInstanceState.getInt(KEY);
            Log.d(tag, "Valore Letto del Contatore="+this.contatore);
        }
        Log.d(tag, "001 - onCreate in azione");

        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);

        textView.setMovementMethod(new ScrollingMovementMethod());

        BtAddOnClickListener listener = new BtAddOnClickListener(textView);
        Button button =  findViewById(R.id.btAdd);
        button.setOnClickListener(listener);

        findViewById(R.id.btClear).setOnClickListener(new BtClearOnClickListener(textView)); // sintetica
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        this.contatore++;
        outState.putInt(KEY, this.contatore);
        Log.d(tag, "201 - onSaveInstanceState in azione");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.d(tag, "202 - onRestoreInstanceState in azione");
        this.contatore = savedInstanceState.getInt(KEY);
        Log.d(tag, "Valore Letto del Contatore="+this.contatore);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "002 - onStart in azione");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "202 - onRestart in azione");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "003 - onResume in azione");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "101 - onPause in azione");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "102 - onStop in azione");
    }


    @Override
    protected void onDestroy() {
        Log.d(tag, "??? - onDestroy in azione");
        super.onDestroy();
    }


}