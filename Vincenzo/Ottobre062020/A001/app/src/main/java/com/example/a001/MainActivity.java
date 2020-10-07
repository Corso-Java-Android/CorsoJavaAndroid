package com.example.a001;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String tag = "*** MainActivity()";

    public MainActivity() {
        super();
        Log.d(tag, "000 - Costruttore in azione");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag, "001 - onCreate in azione");
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "002 - onStart in azione");
        setContentView(R.layout.activity_main);
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