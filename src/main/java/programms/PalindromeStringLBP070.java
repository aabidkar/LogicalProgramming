package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Verify given string is palindrome or not
public class PalindromeStringLBP070 {
	static Logger logger = Logger.getLogger(PalindromeStringLBP070.class);

	static String palindrome(String text) {
		StringBuilder sb = new StringBuilder();
		for (int i = text.length() - 1; i >= 0; i--) {
			sb.append(text.charAt(i));
		}
		if (text.equalsIgnoreCase(sb.toString()))
			return "Palindrome";
		else
			return "Not a Palindrome";
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(PalindromeStringLBP070.palindrome(text));

	}

}
