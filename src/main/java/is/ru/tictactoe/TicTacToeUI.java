package is.ru.tictactoe;

import static spark.Spark.*;
import java.util.Scanner;
import java.lang.Character;


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

	
    public static int getInput(char player) {
        System.out.println("Position of " + player + ": ");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        int input = 0;
 
        try{
            input = Integer.parseInt(inputString);
            System.out.println("Input: " + input);

            return input;
            } catch (NumberFormatException e) {

            }

            System.out.println("Input must be a number! ");
            return getInput(player);

    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        
        displayBoard(game.getBoard());
        int mark = getInput(game.getPlayer());
        
        while(mark < 1|| mark > 9) {
            System.out.println("Input must be a number between 1 and 9! ");
            mark = getInput(game.getPlayer());
        }

        
    }

    
}