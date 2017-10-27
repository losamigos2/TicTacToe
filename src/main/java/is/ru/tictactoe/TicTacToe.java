package is.ru.tictactoe;

import static spark.Spark.*;

public class TicTacToe {

	private static char[][] board;
    private static char currentPlayer;
	private static int count;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'x';
        initializeBoard();
		count = 0;
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

     public static char getPlayer() {
    	return currentPlayer;
    }

	public static void placeMark(int address){
		int [] index = getIndexes(address);
		board[index[0]][index[1]] = currentPlayer;
		count++;
	}
	public boolean isBoardFull() {
	    return count == 9;
	}

	public boolean checkWinner(){
		if(checkRows() == true || checkDiognals() == true || checkColumns() == true){

			return true;
		}

		else if(checkRows() == true || checkDiognals() == true || checkColumns() == true){

			return true;
		}
		return false;
	}

	public boolean checkRows(){
	    if((board[0][0] == currentPlayer) && (board[0][1] == currentPlayer) && (board[0][2] == currentPlayer)){
	        return true;
	    }
	    else if((board[1][0] == currentPlayer) && (board[1][1] == currentPlayer) && (board[1][2] == currentPlayer)){
	        return true;
	    }
	    else if((board[2][0] == currentPlayer) && (board[2][1] == currentPlayer) && (board[2][2] == currentPlayer)){
	        return true;
	    }
	    return false;
	}

	public boolean checkDiognals(){
	    if((board[0][0] == currentPlayer) && (board[1][1] == currentPlayer) && (board[2][2] == currentPlayer)){
	        return true;
	    }
	    else if((board[0][2] == currentPlayer) && (board[1][1] == currentPlayer) && (board[2][0] == currentPlayer)){
	        return true;
	    }
	    return false;
	}

	public boolean checkColumns(){
        if((board[0][0] == currentPlayer) && (board[1][0] == currentPlayer) && (board[2][0] == currentPlayer)){
            return true;
        }
        else if((board[0][1] == currentPlayer) && (board[1][1] == currentPlayer) && (board[2][1] == currentPlayer)){
            return true;
        }
        else if((board[0][2] == currentPlayer) && (board[1][2] == currentPlayer) && (board[2][2] == currentPlayer)){
            return true;
        }
        return false;
    }

	public static int[] getIndexes(int value){
		int counter = 1;
		int [] indexes = new int[2];
	    for (int i = 0; i<3; i++){
	        for (int j = 0; j<3; j++){
	            if (counter == value){
					indexes[0] = i;
					indexes[1] = j;
	                return indexes;
	            }
				counter++;
	        }
	    }
		return indexes;
	}
	public boolean cellAvailable(int value){
		int [] in = getIndexes(value);
		if (board[in[0]][in[1]] != 'x' && board[in[0]][in[1]] != 'o'){
			return true;
		}
		return false;
	}
	public int playRound(int place){
		placeMark(place);
		if (checkWinner()){
			return 1;
		}
		else if(isBoardFull()){
			return 2;
		}
		currentPlayer = changePlayer();
		return 0;
	}

    public static void main(String[] args) {

    }
}
