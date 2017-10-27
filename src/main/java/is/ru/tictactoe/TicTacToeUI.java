package is.ru.tictactoe;

import static spark.Spark.*;


public class TicTacToeUI {

	public static void displayBoard(char[][] board) {
        System.out.println("-------------");
		
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		char[][] board = game.getBoard();

		displayBoard(board);

		
    }

    
}