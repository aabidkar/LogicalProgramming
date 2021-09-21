package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Implement a program to return First capital letter in a String

input -------> A string from the user
constraint --> non-empty string
output ------> First Capital letter

Logic:
~~~~~~
1-----> read a string value from the user
2 ----> we need to check for fisrt Capital letter, 
3 ----> return capital letter, terminate program.

Hello ----> H
hEllo ----> E
heLlo ----> L
HellO ----> H
 */
public class FristCapitalLetterLBP034 {
	static Logger logger = Logger.getLogger(FristCapitalLetterLBP034.class);

	static char firstCapitalLetter(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 65 && text.charAt(i) <= 92)
				return text.charAt(i);
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(FristCapitalLetterLBP034.firstCapitalLetter(text));

	}

}
