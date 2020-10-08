package com.example.simplecalc;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MathClickListener implements View.OnClickListener {
    private String sign;
    private TextView text1;
    private TextView text2;
    private TextView risultato;

    public MathClickListener(TextView text1, TextView text2, TextView risultato, String sign){
        this.text1 = text1;
        this.text2 = text2;
        this.risultato = risultato;
        this.sign = sign;
    }

    @Override
    public void onClick(View v) {

        //VALORI IN TEXTVIEW
        String cont1 = text1.getText().toString();
        String cont2 = text2.getText().toString();

        if(cont1.length()==0||cont2.length()==0)
            return;

        int oper1 = Integer.parseInt(cont1);
        int oper2 = Integer.parseInt(cont2);

        switch (this.sign) {
            case "+": {
                this.risultato.setText("" + (oper1 + oper2));
                return;
            }
            case "x":{
                this.risultato.setText(""+(oper1*oper2));
                return;
            }
            case "-":{
                this.risultato.setText(""+(oper1-oper2));
                return;
            }
            case ":": {
                if(oper2==0){
                    this.risultato.setText("Inf");
                }else{
                    this.risultato.setText(""+(oper1/oper2));
                }
            }
            default: {
                return;
            }
        }

    }
}
