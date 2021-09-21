package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
You are given coordinates, a string that represents the coordinates of a square of the chess board. bellow is the chess board for your reference.

Return True if the square is in white, and false if the square is in Black.

The coordinates will always represent a valid chess board square. The coordinates will always have the letter first, and the number second.

input ----------> a string
constraint -----> length of the string is 2, a<=c[0]<=h and 1<=c[1]<=8
output ---------> true or false
 */
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
