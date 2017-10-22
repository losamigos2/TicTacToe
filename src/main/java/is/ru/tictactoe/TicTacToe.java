package is.ru.tictactoe;

import static spark.Spark.*;

public class TicTacToe {

	private char[][] board; 
    private static char currentPlayer;
			
    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'x';
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
}