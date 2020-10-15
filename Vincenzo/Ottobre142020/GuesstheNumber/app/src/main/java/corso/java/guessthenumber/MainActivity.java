package corso.java.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Game game = null;
    public TextView text = null;
    public Context MainActivity = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity = this;
        text = findViewById(R.id.text);
        ListView listView = findViewById(R.id.ListView);
        game = new Game(text, listView, MainActivity);

        final TextView etn = findViewById(R.id.editTextNumber);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = game.play(etn);
                if(res==1){
                    Intent intent = new Intent(MainActivity, Vittoria.class);
                    startActivity(intent);
                    game.reset();
                }else if(res==-1){
                    Intent intent = new Intent(MainActivity, Sconfitta.class);
                    intent.putExtra("Numero", game.getNumero());
                    startActivity(intent);
                    game.reset();
                }
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.reset();
            }
        });
    }
}