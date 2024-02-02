package datenstructur;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String[][] board = {
                {"X", "0", "X"},
                {"0", "-", "X"},
                {"X", "0", "X"}
        };

        for(int i = 0; i< board.length; i++){
            for(int j = 0; j < board[i].length -1; j++) {
                System.out.println(i);
                System.out.println(j);
                System.out.println(board[i][j] +"und"+board[i][j+1]);
                if (board[i][j] == board[i][j+1]) {

                }
            }
        }


    }
}
