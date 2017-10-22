package is.ru.tictactoe;

import static spark.Spark.*;

public class TicTacToe {
	public static void main(String [] args) {
		get("/", (req, res) -> {
				return "No route specified. Try /add/1,2";
		});
		get(
				"/add/:input",
				(req, res) -> add(req.params(":input"))
		);

	}
	private static int add(String input) {
			StringCalculator Calculator = new StringCalculator();
			return Calculator.add(input);
	}
	public static String Hello(){
		return "Hello!";
	}
}
