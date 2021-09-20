package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//the middle character(s). if the word's length is odd return the middle character. if the word's length is even, return the middle two characters.
public class ReturnMiddleCharacterLBP068 {
	static Logger logger = Logger.getLogger(ReturnMiddleCharacterLBP068.class);

	static String returnMiddleCharacter(String text) {
		StringBuilder sb = new StringBuilder();
		int length = text.length();
		for (int i = 0; i < length; i++)
			if (length % 2 == 0) {
				sb.append(text.charAt((length / 2) - 1));
				return sb.append(text.charAt(length / 2)).toString();
			}
		return sb.append(text.charAt(length / 2)).toString();
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(ReturnMiddleCharacterLBP068.returnMiddleCharacter(text));
	}
}
