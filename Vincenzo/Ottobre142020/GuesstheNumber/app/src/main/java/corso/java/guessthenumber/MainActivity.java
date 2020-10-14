package corso.java.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int tentativi = 0;
    public int numero = 0;
    public TextView text = null;
    public TextView text2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        numero = 1 + rand.nextInt(1000);
        tentativi = 10;
        text = findViewById(R.id.text);
        text.setText("Ho pensato ad un numero tra 1 e 1000. Hai a disposizione "+tentativi+" per indovinarlo.");
        text2 = findViewById(R.id.text2);

        final TextView etn = findViewById(R.id.editTextNumber);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int guess = Integer.parseInt(etn.getText().toString());
                if(guess==numero){
                    //GESTIRE VITTORIA
                }else{
                    tentativi--;
                    if(tentativi==0){
                        //GESTIRE SCONFITTA
                    }else{
                    text.setText("Ho pensato ad un numero tra 1 e 1000. Hai a disposizione "+tentativi+" per indovinarlo.");
                    if(guess<numero){
                        text2.setText("Il numero è >");
                    }else{
                        text2.setText("Il numero è <");
                    }
                    }
                }
            }
        });
    }
}