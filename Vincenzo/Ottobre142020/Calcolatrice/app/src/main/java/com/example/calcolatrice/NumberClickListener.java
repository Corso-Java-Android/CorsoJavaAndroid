package com.example.calcolatrice;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NumberClickListener implements View.OnClickListener {

    Button button = null;
    Calcolatrice calcolatrice = null;
    TextView tx = null;

    public NumberClickListener(Button button, Calcolatrice calcolatrice, TextView tx){
        this.button = button;
        this.calcolatrice = calcolatrice;
        this.tx = tx;
    }

    @Override
    public void onClick(View v) {
        int i = Integer.parseInt(button.getText().toString());
        double k = calcolatrice.setNumber(i);
        tx.setText(""+k);
    }
}
