package com.example.a001;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonsOnClickListener implements View.OnClickListener {
    private static final String TAG = "BtAddOnClickListener";

    private State state;
    private TextView textView;

    public ButtonsOnClickListener(State state, TextView textView) {
        this.state = state;
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        Button b = (Button) v; // downcasting
        Log.d(TAG, "onClick: PREMUTO Bottone <"+b.getText().toString()+">");
        switch(b.getText().toString().toLowerCase()) {
            case "add":
                String msg = "Il  valore del contatore è "+this.state.updateContatore() +"\n";
                this.textView.append(msg);
                break;
            case "clear":
                this.state.reset();
                this.textView.setText("");
                break;
        }
    }
}