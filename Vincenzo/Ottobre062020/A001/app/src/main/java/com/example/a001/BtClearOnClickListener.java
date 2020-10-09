package com.example.a001;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class BtClearOnClickListener implements View.OnClickListener {
    private static final String TAG = "BtClearOnClickListener";

    private TextView textView;
    private Context context;
    private State listener;

    public BtClearOnClickListener(Context context, TextView textView, State listener) {
        this.context = context;
        this.textView = textView;
        this.listener = listener;
    }
    @Override
    public void onClick(View v) {
        Log.d(TAG, "onClick: PREMUTO Bottone CLEAR");
        this.textView.setText("");
        listener.reset();
        Toast toast = Toast.makeText(context,"Premuto Bottone Clear", Toast.LENGTH_SHORT);
        toast.show();
    }
}
