package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicTacToeTest {
	@Test
	public void testEmptyStringReturnsZero() {
			StringCalculator Calculator = new StringCalculator();
			assertEquals(0, Calculator.add(""));
	}
	}
