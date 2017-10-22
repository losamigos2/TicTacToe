package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicTacToeTest {

	@Test
	public void testChangePlayer(){
		TicTacToe game = new TicTacToe();
		assertEquals('o' ,game.changePlayer());
	}