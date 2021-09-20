package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Repeating Letters
public class RepeatingLetterLBP059 {
	static Logger logger = Logger.getLogger(RepeatingLetterLBP059.class);

	static String repeatingLetters(String text) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			sb.append(text.charAt(i));
			sb.append(text.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(RepeatingLetterLBP059.repeatingLetters(text));

	}

}
