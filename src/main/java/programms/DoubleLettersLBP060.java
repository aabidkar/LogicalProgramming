package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Check double letters is available or not
public class DoubleLettersLBP060 {
	static Logger logger = Logger.getLogger(DoubleLettersLBP060.class);

	static boolean doubleLetters(String text) {
		text = text.toLowerCase();
		for (int i = 0; i < text.length() - 1; i++) {
			if (text.charAt(i) == text.charAt(i + 1))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(DoubleLettersLBP060.doubleLetters(text));
	}
}