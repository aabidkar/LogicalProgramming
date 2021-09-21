package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Create a method that takes a string and returns a string in which each character is repeated once.

input ---------------> String from the user
constraint ----------> No
output --------------> String

String ------> SSttrriinngg

Logic:
~~~~~~
1. read a string from the user as s
2. create a new string ns
3. copy each character twice to the ns
4. print ns

 */
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
