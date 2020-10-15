package com.example.calcolatrice;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Calcolatrice {
    private double num1;
    private double num2;
    private String sign;
    private Boolean isFloat;
    private int floatDiv;
    private ListView listView = null;
    private ArrayList<String> history = null;
    private Context context = null;

    public Calcolatrice(ListView listView, Context context){
        num1 = 0;
        num2 = 0;
        sign = "";
        isFloat = false;
        floatDiv = 1;
        this.listView = listView;
        this.history = new ArrayList<String>();
        this.context = context;
    }

    public double setNumber(double number){
        if(sign.equals("")){    //se non ho ancora settato il segno opero sul numero 1
            if(isFloat){    //se sto operando sulla virgola mobile
                floatDiv = floatDiv * 10;
                num1 = num1 + (number / floatDiv);
            }else{  //se sto operando su interi
                num1 = (num1*10)+number;
            }
            return num1;
        }else {  //altrimenti sul numero 2
            if (isFloat) {    //se sto operando sulla virgola mobile
                floatDiv = floatDiv * 10;
                num2 = num2 + (number / floatDiv);
            } else {  //se sto operando su interi
                num2 = (num2 * 10) + number;
            }
            return num2;
        }
    }

    public double inversione(){
        if(sign.equals("")) {    //se non ho ancora settato il segno opero sul numero 1
            num1 = -1*num1;
            return num1;
        }else{
            num2 = -1*num2;
            return num2;
        }
    }

    public void decimal(){
        isFloat = true;
    }

    public String setSign(String sign){
        if(num2==0.0){
            this.sign = sign;
            floatDiv = 1;
            isFloat = false;
            return num1+this.sign;
        }else{
            return ""+num2;
        }
    }

    public double esegui(){
        switch (sign){
            case "+": return somma();
            case "X": return moltiplicazione();
            case "/": return divisione();
            case "-": return sottrazione();
            default: return 0;
        }
    }

    private double somma(){
        double toReturn = num1+num2;
        updateList(num1+" + "+num2+" = "+toReturn);
        return toReturn;
    }

    private double moltiplicazione(){
        double toReturn = num1*num2;
        updateList(num1+" * "+num2+" = "+toReturn);
        return toReturn;
    }

    private double divisione() throws ArithmeticException {
        if(num2!=0){
            double toReturn = num1/num2;
            updateList(num1+" / "+num2+" = "+toReturn);
            return toReturn;
        } else {
            throw new ArithmeticException("Divisione per 0!");   //Gestire la divisione per 0
        }
    }

    private double sottrazione(){
        double toReturn = num1-num2;
        updateList(num1+" - "+num2+" = "+toReturn);
        return toReturn;
    }

    public void reset() {
        num1 = 0;
        num2 = 0;
        sign = "";
        isFloat = false;
        floatDiv = 1;
    }

    public String cancella() {
        if(sign.equals("")){    //cancella il num1
            num1 = 0.0;
            isFloat = false;
            return ""+num1;
        }else {
            num2 = 0.0;   //cancella il secondo num
            isFloat = false;
            return num1+sign;
        }
    }

    private void updateList(String update){
        history.add(update);
        listView.setAdapter(new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, history));
    }

}
