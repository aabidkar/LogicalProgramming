package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Count special character in a string
public class CountSpecialCharacterLBP036 {
	static Logger logger = Logger.getLogger(CountSpecialCharacterLBP036.class);
	static int counter = 0;

	static int countSpecialCharcter(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (((text.charAt(i) >= 65) && (text.charAt(i) <= 90))
					|| ((text.charAt(i) >= 97) && (text.charAt(i) <= 122))
					|| ((text.charAt(i) >= 48) && (text.charAt(i) <= 57)) || (text.charAt(i) == ' '))
				continue;
			else
				counter++;
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(CountSpecialCharacterLBP036.countSpecialCharcter(text));

	}

}