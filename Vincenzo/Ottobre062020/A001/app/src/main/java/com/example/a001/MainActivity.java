package com.example.a001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String tag = "******** MainActivity()";

    public  MainActivity(){
        super();
        Log.d(tag, "Costruttore in esecuzione");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag, "onCreate in esecuzione");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy(){
        Log.d(tag, "onDestroy in esecuzione");
        super.onDestroy();
    }
}