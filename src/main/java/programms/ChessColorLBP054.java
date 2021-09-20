package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Get the chess color
public class ChessColorLBP054 {
	static Logger logger = Logger.getLogger(ChessColorLBP054.class);

	static String chessColor(String text) {
		int firstNumber = text.charAt(0);
		char secondNumber = text.charAt(1);
		int numberOne = 0;
		int numberTwo = 0;
		numberOne = (firstNumber - 97) % 2 + 1;
		if (numberOne == 2)
			numberOne %= 2;
		numberTwo = secondNumber % 2;
		if (numberOne == numberTwo)
			return "Black";
		else
			return "White";
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(ChessColorLBP054.chessColor(text));
	}

}
