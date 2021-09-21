package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Check if String ending matches second String

Create a function/method that takes two Strings and returns true of the first string ends with second string, otherwise return false.

Input:  two strings
Constraints: No 
Output: true or false

abc, bc -----> true
kalyan, an --> true
kalyan, a ---> false

Logic:
~~~~~~
1. read s1
2. read s2
3. from reverse compare all the characters,
4. len of s2 and counter

kalyan
xan

0->1->2

 */
public class CompareStringEndLBP051 {
	static Logger logger = Logger.getLogger(CompareStringEndLBP051.class);

	static boolean stringCompare(String text, String compare) {
		int j = 0;
		int count = 0;
		for (int i = text.length() - compare.length(); i < text.length(); i++, j++) {
			if (compare.charAt(j) == text.charAt(i))
				count++;
		}
		return count == compare.length();
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		String compare = myObj.nextLine();
		logger.info(CompareStringEndLBP051.stringCompare(text, compare));

	}

}
