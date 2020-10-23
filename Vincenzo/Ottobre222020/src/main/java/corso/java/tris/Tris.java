package corso.java.tris;

import android.widget.Button;

public class Tris {
    private final static String CROSS = "X";
    private final static String CIRCLE  = "O";
    public String[][] board = null;
    public int scoreX;
    public int scoreO;
    public String current_symbol;
    Button[] buttons = null;

    public Tris(Button[] buttons){
        this.buttons = buttons;
        reset();
    }

    //restituisce true se qualcuno ha vinto, false altrimenti
    public Boolean checkWinCOndition(){
        if(confronto(board[0], CROSS)||confronto(board[1], CROSS)||confronto(board[2], CROSS)){
            scoreX++;
            return true;
        }else  if(confronto(board[0], CIRCLE)||confronto(board[1], CIRCLE)||confronto(board[2], CIRCLE)){
            scoreO++;
            return true;
        }else{
            //controlla le colonne
            for(int i=0;i<3;i++){
                String[] column = new String[]{board[0][i], board[1][i], board[2][i]};
                if(confronto(column, CROSS)){
                    scoreX++;
                    return true;
                }else if(confronto(column, CIRCLE)){
                    scoreO++;
                    return true;
                }
            }
            //Controlla le Diagonali
            String[] diagonal1 = new String[]{board[0][0], board[1][1], board[2][2]};
            String[] diagonal2 = new String[]{board[0][2], board[1][1], board[2][0]};
            if(confronto(diagonal1, CROSS)||confronto(diagonal2, CROSS)){
                scoreX++;
                return true;
            }else if(confronto(diagonal1, CIRCLE)||confronto(diagonal2, CIRCLE)){
                scoreO++;
                return true;
            }

        }
        return false;
    }

    public String set(int x, int y){    //restituisce il simbolo corrente se la mossa non viene effettuata, altrimenti effettua la mossa, cambia il simbolo e lo restituisce
        if(board[x][y].equals("")){ //se la casella è vuota
            board[x][y] = current_symbol;
            if(current_symbol==CROSS){
                current_symbol = CIRCLE;
            }else{
                current_symbol = CROSS;
            }
        }
        return current_symbol;
    }

    public String get(int x, int y){
        return board[x][y];
    }

    public void reset(){
        inizializeBoard();
        scoreX = 0;
        scoreO = 0;
        current_symbol = CIRCLE;
    }

    public void inizializeBoard(){
        board = new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
        for(int i=0; i<buttons.length;i++)
            buttons[i].setText("");
    }

    private Boolean confronto(String[] row, String symbol){
        return(row[0].equals(symbol)&&row[1].equals(symbol)&&row[2].equals(symbol));
    }

}
