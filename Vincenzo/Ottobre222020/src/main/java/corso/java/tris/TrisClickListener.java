package corso.java.tris;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TrisClickListener implements View.OnClickListener {
    Tris tris;
    Button button;
    TextView player;
    TextView xscore;
    TextView oscore;
    int x;
    int y;

    public TrisClickListener(Tris tris, Button button, TextView player, TextView xscore, TextView oscore, int x, int y) {
        this.tris = tris;
        this.button = button;
        this.player = player;
        this.xscore = xscore;
        this.oscore = oscore;
        this.x = x;
        this.y = y;
    }

    @Override
    public void onClick(View v) {
        String result = tris.set(x, y);
        button.setText(tris.get(x, y));
        player.setText(result);
        if(tris.checkWinCOndition()){   //controlla se qualcuno ha vinto
            xscore.setText(""+tris.scoreX);    //eventualmente aggiorna i punteggi
            oscore.setText(""+tris.scoreO);
            tris.inizializeBoard();
        }
    }
}
