package is.ru.tictactoe;

import static spark.Spark.*;

public class TicTacToe {

	private char[][] board;
    private static char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'x';
        initializeBoard();
    }

    public static char changePlayer() {
        if (currentPlayer == 'x') {
            currentPlayer = 'o';
        }
        else {
            currentPlayer = 'x';
        }

        return currentPlayer;
    }

    public void initializeBoard() {
        // Loop through rows
        for (int i = 0; i < 3; i++) {
			
            // Loop through columns
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
    
    public static void main(String[] args) {

    }
}
