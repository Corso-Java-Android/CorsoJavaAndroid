package com.example.a001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public  MainActivity(){
        super();
        Log.d("***************** MainActivity()", "Costruttore in esecuzione");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("***************** onCreate()", "onCreate in esecuzione");
        setContentView(R.layout.activity_main);
    }
}