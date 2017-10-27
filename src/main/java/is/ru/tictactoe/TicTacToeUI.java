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
        
        String play = "";
        do {
            TicTacToe game = new TicTacToe();
			int status = 0;


            while(status == 0) {
                displayBoard(game.getBoard());
                int mark = getInput(game.getPlayer());

                while((mark < 1|| mark > 9 )&& game.cellAvailable(mark)) {
                    System.out.println("Input must be a number between 1 and 9 and available!");
                    mark = getInput(game.getPlayer());
                }
                status = game.playRound(mark);
            }
            if (status == 1) {
				System.out.println("Player  " + game.getPlayer() + "is the winner!");
			}
			else if ( status == 2){
				System.out.println("The game has ended with a draw!");
			}
			System.out.println("do you want to play another game? y/n: ");
			Scanner in = new Scanner(System.in);
	        play = in.nextLine();
            System.out.println(play);
        } while(play.charAt(0) == 'y');
    }
}
