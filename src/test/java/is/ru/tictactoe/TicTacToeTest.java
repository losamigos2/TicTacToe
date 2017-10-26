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
	@Test
	public void testplaceMark(){
		TicTacToe game = new TicTacToe();
		char [][] testboard = game.getBoard();
		game.placeMark(5);
		assertEquals('x',testboard[1][1]);
	}

	@Test
	public void testCheckRows(){
	    TicTacToe game = new TicTacToe();
	    game.placeMark(4);
	    game.placeMark(5);
	    game.placeMark(6);

	    assertEquals(true, game.checkRows());
	}

}
