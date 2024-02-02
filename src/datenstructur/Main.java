package datenstructur;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String[][] board = {
                {"X", "-", "X"},
                {"0", "-", "X"},
                {"X", "X", "X"}
        };

        for(int i = 0; i< board.length; i++){
            String charToRemember = null;
            boolean lineHasWinner = true;
            for(int j = 0; j < board[i].length; j++) {
                System.out.println(board[i][j]);
                if (charToRemember == null) {
                    charToRemember = board[i][j];
                } else if(charToRemember != board[i][j]){
                    lineHasWinner = false;
                    break;
                }
            }
            if(lineHasWinner == true) {
                System.out.println("line has winner");
                break;
            }
        }


    }
}
