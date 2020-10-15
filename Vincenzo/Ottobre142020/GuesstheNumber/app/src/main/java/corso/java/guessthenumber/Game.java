package corso.java.guessthenumber;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

import java.util.Random;

public class Game {
    Random rand = null;
    int numero;
    int tentativi;
    TextView text = null;
    TextView text2 = null;

    public Game(TextView text, TextView text2){
        rand = new Random();
        this.text = text;
        this.text2 = text2;
        reset();
    }

    public int play(TextView etn){
        if(tentativi==0)
            return -1;
        int guess = Integer.parseInt(etn.getText().toString());
        if(guess==numero){
            //GESTIRE VITTORIA
            return 1;
        }else{
            tentativi--;
            if(tentativi==0){
                //SCONFITTA
                return -1;
            }else{
                text.setText("Ho pensato ad un numero tra 1 e 1000. Hai a disposizione "+tentativi+" tentativi per indovinarlo.");
                if(guess<numero){
                    text2.append(guess+": Il numero è >\n");
                }else{
                    text2.append(guess+": Il numero è <\n");
                }
                return 0;
            }
        }
    }

    public void reset() {
        numero = 1 + rand.nextInt(1000);
        tentativi = 10;
        text.setText("Ho pensato ad un numero tra 1 e 1000. Hai a disposizione "+tentativi+" tentativi per indovinarlo.");
        text2.setText("");
    }

    public int getNumero() {
        return numero;
    }
}
