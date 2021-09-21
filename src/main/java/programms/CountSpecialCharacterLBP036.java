package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
A company launched a new text editor that allows users to enter english letters, numbers and white spaces only. If a user attempts to enter any other type of characters, it is counted as miss. Given a String text, write an algorithm to help the developer detect the number of misses by a given user in the given input.

input --------> String
constraint ---> non-empty string
output -------> number of misses

Good@morning! -----> 2

Logic:
~~~~~~~
1--------> read a string from the user
2 -------> each and every char if it is a special character
3 -------> increment counter value
4 -------> counter values
 */
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