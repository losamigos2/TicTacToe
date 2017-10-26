package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicTacToeTest {

	@Test
	public void testChangePlayer(){
		TicTacToe game = new TicTacToe();
		assertEquals('o' ,game.changePlayer());
	}

	@Test
	public void testInitializeBoard() {
		TicTacToe game = new TicTacToe();
		game.initializeBoard();
		char[][] testBoard = game.getBoard();
		assertEquals('1' ,testBoard[0][0]);
		assertEquals('2' ,testBoard[0][1]);
		assertEquals('3' ,testBoard[0][2]);
		assertEquals('4' ,testBoard[1][0]);
		assertEquals('5' ,testBoard[1][1]);
		assertEquals('6' ,testBoard[1][2]);
		assertEquals('7' ,testBoard[2][0]);
		assertEquals('8' ,testBoard[2][1]);
		assertEquals('9' ,testBoard[2][2]);
	}
}
