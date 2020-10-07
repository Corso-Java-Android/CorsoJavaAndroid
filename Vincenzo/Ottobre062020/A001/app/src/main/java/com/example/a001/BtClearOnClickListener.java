package com.example.a001;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class BtClearOnClickListener implements View.OnClickListener {
    private static final String TAG = "BtClearOnClickListener";
    private TextView textView;

    public BtClearOnClickListener(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "onClick: PREMUTO Bottone CLEAR");
        textView.setText("");
    }
}
