package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Program to count number of special characters and white spaces in a given string.

input --------> A string from the user
constraint ---> non-empty string
output -------> number of special characters


Logic:
-------
1--------------> read a string from the user
2 -------------> check each and every character
3 -------------> if lower case alphabet, digit, upper case alphabet conitnue
4 -------------> else counter++
5 -------------> print counter
 */
public class CountSpecialCharacterLBP031 {
	static int count = 0;
	static Logger logger = Logger.getLogger(CountSpecialCharacterLBP031.class);

	static int countSpeicalCharacter(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 65 && text.charAt(i) <= 90 || text.charAt(i) >= 97 && text.charAt(i) <= 122
					|| text.charAt(i) >= 48 && text.charAt(i) <= 57)
				continue;// 65-A 90-Z
			else
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(CountSpecialCharacterLBP031.countSpeicalCharacter(text));
	}

}
