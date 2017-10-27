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
		assertEquals(true,game.placeMark(1));
	}

	@Test
	public void testCheckRows(){
	    TicTacToe game = new TicTacToe();
	    game.placeMark(4);
	    game.placeMark(5);
	    game.placeMark(6);

	    assertEquals(true, game.checkRows());
	}

	@Test
	public void testCheckDiognals(){
	    TicTacToe game = new TicTacToe();
	    game.placeMark(7);
	    game.placeMark(5);
	    game.placeMark(3);

	    assertEquals(true, game.checkDiognals());
	}


	@Test
	public void testisBoardFull_empty(){
	  	TicTacToe game = new TicTacToe();
	  	assertEquals(false ,game.isBoardFull());
	}

	// Test full board
	@Test
	public void testisBoardFull_full(){
	  	TicTacToe game = new TicTacToe();
	  	for (int i = 1; i < 10; i++){
	    	game.placeMark(i);
	  	}
	  	assertEquals(true ,game.isBoardFull());
	}

	@Test
	public void testCheckColumns(){
	    TicTacToe game = new TicTacToe();
	    game.placeMark(1);
	    game.placeMark(4);
	    game.placeMark(7);
	    assertEquals(true, game.checkColumns());
	}

	@Test
	public void testCheckColumnsFalse(){
	    TicTacToe game = new TicTacToe();
	    game.placeMark(2);
	    game.placeMark(3);
	    game.placeMark(4);

	    assertEquals(false, game.checkColumns());
	}

	@Test
	public void testCheckWinner(){
		TicTacToe game = new TicTacToe();
		game.placeMark(2);
		game.placeMark(5);
		game.placeMark(8);

		assertEquals(true, game.checkWinner());
	}
	@Test
	public void testgetIndexes(){
		TicTacToe game = new TicTacToe();
		assertEquals(0, game.getIndexes(1)[0]);
		assertEquals(0, game.getIndexes(1)[1]);
		assertEquals(1, game.getIndexes(6)[0]);
		assertEquals(2, game.getIndexes(6)[1]);
		assertEquals(2, game.getIndexes(9)[0]);
		assertEquals(2, game.getIndexes(9)[1]);
	}
	@Test
	public void testcellAvailable(){
		TicTacToe game = new TicTacToe();
		game.placeMark(3);
		assertEquals(false, game.cellAvailable(3));
		assertEquals(true, game.cellAvailable(1));

	}
	@Test
	public void testplayRound(){
		TicTacToe game = new TicTacToe();
		assertEquals(0, game.playRound(1));
		assertEquals(0, game.playRound(4));
		assertEquals(0, game.playRound(2));
		assertEquals(0, game.playRound(5));
		assertEquals(1, game.playRound(3));
	}
}
