package com.example.a001;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String KEY_CONTATORE = "Contatore dell'applicazione";
    private static final String KEY_TEXT = "Contenuto della TextView";

    private State contatore = new State(0);

    private TextView textView = null;
    private BtAddOnClickListener listener = null;

    private static final String tag = "*** MainActivity()";


    public MainActivity() {
        super();
        Log.d(tag, "000 - Costruttore in azione");
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Activity shutdown")
                .setMessage("Are you sure you want to exit this app?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Chiusura Abortita", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(tag, "001 - onCreate in azione");

        setContentView(R.layout.activity_main);

        this.textView = findViewById(R.id.textView);
        this.textView.setMovementMethod(new ScrollingMovementMethod());

        if (savedInstanceState != null) {
            this.contatore = (State) savedInstanceState.getSerializable(KEY_CONTATORE);
            this.textView.setText(savedInstanceState.getString(KEY_TEXT));
            Log.d(tag, "Valore Letto del Contatore=" + this.contatore);
        }

        this.listener = new BtAddOnClickListener(this.contatore, this.textView);
        Button button = findViewById(R.id.btAdd);
        button.setOnClickListener(this.listener);

        findViewById(R.id.btClear).setOnClickListener(new BtClearOnClickListener(getApplicationContext(), this.textView, this.contatore)); // sintetica

        findViewById(R.id.btOk).setOnClickListener(
                new View.OnClickListener() { // anonymous inner class
                    @Override
                    public void onClick(View v) {
                        MainActivity.this.textView.append("Premuto btOk\n");
                    }
                }
        );
    }

    public void gestisciBottone(View view) {

    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {

        outState.putSerializable(KEY_CONTATORE, contatore);
        outState.putString(KEY_TEXT, this.textView.getText().toString()); // salvo il contenuto della text Area

        Log.d(tag, "201 - onSaveInstanceState in azione");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.d(tag, "202 - onRestoreInstanceState in azione");

//        this.contatore = savedInstanceState.getInt(KEY_CONTATORE);
        contatore = (State) savedInstanceState.getSerializable(KEY_CONTATORE);
        this.listener.setState(contatore);

        this.textView.setText(savedInstanceState.getString(KEY_TEXT));

        Log.d(tag, "Valore Letto del Contatore=" + this.contatore);
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