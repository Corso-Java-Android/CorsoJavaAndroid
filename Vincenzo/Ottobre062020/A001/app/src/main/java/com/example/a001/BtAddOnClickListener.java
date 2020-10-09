package com.example.a001;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class BtAddOnClickListener implements View.OnClickListener {
    private static final String TAG = "BtAddOnClickListener";

    private State contatore;
    private TextView textView;

    public BtAddOnClickListener(State contatore, TextView textView) {
        this.contatore = contatore;
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "onClick: PREMUTO Bottone ADD");
        contatore.updateContatore();
        String msg = "Il  valore del contatore è "+this.contatore+"\n";
        this.textView.append(msg);
    }

    public int getContatore() {
        return this.contatore.getContatore();
    }

    public int updateContatore() {
        return this.contatore.updateContatore();
    }

    public void reset(){
       this.contatore.reset();
    }

    public void setState(State state){
        this.contatore = state;
    }

}
