package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Implement a program to calculate toggle case of each characters of a string

input -------> A String from user
constriant --> non-empty String
output ------> toggle case string

HeLlO ---> hElLo

Logic:
~~~~~~
1-------> read a string from the user
2 ------> extract every character
3 ------> if char is in lower case convert to upper case & vice versa
4 ------> print string

 */
public class LowertoUpperCaseLBP035 {
	static Logger logger = Logger.getLogger(LowertoUpperCaseLBP035.class);

	static StringBuilder lowertoUpperCase(String text) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z')
				sb.append((char) (text.charAt(i) + 32));
			else if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z')
				sb.append((char) (text.charAt(i) - 32));
		}
		return sb;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(LowertoUpperCaseLBP035.lowertoUpperCase(text));
	}
}
