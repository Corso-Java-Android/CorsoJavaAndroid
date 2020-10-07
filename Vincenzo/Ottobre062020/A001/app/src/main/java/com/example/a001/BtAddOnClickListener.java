package com.example.a001;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class BtAddOnClickListener implements View.OnClickListener {
    private static final String TAG = "BtAddOnClickListener";

    private int contatore = 0;
    private TextView textView;

    public BtAddOnClickListener(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "onClick: PREMUTO Bottone ADD");
        contatore++;
        String msg = "Il  valore del contatore è "+this.contatore+"\n";
        this.textView.append(msg);
    }
}
