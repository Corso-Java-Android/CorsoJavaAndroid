package com.example.calcolatrice;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignClickListener implements View.OnClickListener {
    Button button = null;
    Calcolatrice calcolatrice = null;
    TextView tx = null;

    public SignClickListener(Button button, Calcolatrice calcolatrice, TextView tx){
        this.button = button;
        this.calcolatrice = calcolatrice;
        this.tx = tx;
    }

    @Override
    public void onClick(View v) {
        String sign = button.getText().toString();
        String toDisplay = calcolatrice.setSign(sign);
        tx.setText(toDisplay);
    }
}
