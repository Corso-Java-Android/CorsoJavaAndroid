package corso.java.guessthenumber;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class Game {
    Random rand = null;
    int numero;
    int tentativi;
    TextView text = null;
    ListView listView = null;
    ArrayList<String> history = null;
    Context context = null;

    public Game(TextView text, ListView listView, Context context){
        rand = new Random();
        this.text = text;
        this.listView = listView;
        this.history = new ArrayList<String>();
        this.context = context;
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
                    history.add(guess+": Il numero è >\n");
                }else{
                    history.add(guess+": Il numero è <\n");
                }
                listView.setAdapter(new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, history));
                return 0;
            }
        }
    }

    public void reset() {
        numero = 1 + rand.nextInt(1000);
        tentativi = 10;
        text.setText("Ho pensato ad un numero tra 1 e 1000. Hai a disposizione "+tentativi+" tentativi per indovinarlo.");
        history.clear();
        listView.setAdapter(new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, history));
    }

    public int getNumero() {
        return numero;
    }
}
