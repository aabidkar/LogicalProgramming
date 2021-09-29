package programms;

import java.util.Scanner;
/*
Swap corner words and reverse middle characters

Write a Java program to take an input string and exchange the first and last word and reverse the middle word.

input -------> a string
con ---------> no
output ------> a string


Hello welcome to Java ------> Java ot emoclew Hello

fs = Hello
ls = avaJ

Logic:
~~~~~~
1. read a string s from the user.
2. until getting space character store the result in a fs.
3. starting fetch characters from last char to until space character store it in ls.
4. from end to starting point reverse each character and print.
 */
import org.apache.log4j.Logger;

public class ExchangeStringLBP074 {
	static Logger logger = Logger.getLogger(ExchangeStringLBP074.class);

	static String exchangeString(String text) {

		StringBuilder first = new StringBuilder();
		StringBuilder second = new StringBuilder();
		StringBuilder third = new StringBuilder();
		int firstSpace = 0;
		int secondSpace = 0;
		// Getting first String
		for (int i = 0; i < text.length(); i++) {
			first.append(text.charAt(i));
			firstSpace = i;
			if (text.charAt(i) == ' ')
				break;
		}
		// Getting last String
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ')
				secondSpace = i + 1;
		}
		for (int i = secondSpace; i < text.length(); i++) {
			second.append(text.charAt(i));
		}
		// Reverse of a middle string
		for (int i = secondSpace - 1; i >= firstSpace; i--) {
			third.append(text.charAt(i));
		}
		// Append all string together & return
		return second.toString() + third.toString() + first.toString();
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(ExchangeStringLBP074.exchangeString(text));
	}
}
