package is.ru.tictactoe;

import static spark.Spark.*;

public class TicTacToe {

	private static char[][] board;
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

    public static void initializeBoard() {
        board[0][0] = '1';
        board[0][1] = '2';
        board[0][2] = '3';
        board[1][0] = '4';
        board[1][1] = '5';
        board[1][2] = '6';
        board[2][0] = '7';
        board[2][1] = '8';
        board[2][2] = '9';
    }

    public static char[][] getBoard() {
        return board;
    }

	public static boolean placeMark(int address){
		int counter = 1;
	    for (int i = 0; i<3; i++){
	        for (int j = 0; j<3; j++){
	            if (counter == address){
	                board[i][j] = currentPlayer;
					return true;
	            }
				counter++;
	        }
	    }
		return false;
	}
	public boolean isBoardFull() {
	    for (int i = 0; i < 3; i++){
	    	for (int j = 0; i < 3; i++){
	        	if (board[i][j] != 'x' && board[i][j] != 'o') {
	          	return false;
	        	}
	      	}
	    }
	    return true;
	}

    public static void main(String[] args) {

    }
}
