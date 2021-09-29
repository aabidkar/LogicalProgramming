package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;
/*
 Write a function that returns the first n vowels of a string.

input ------> a string from the user and an integer value
cons -------> Return "invalid" if the n exceeds the number of vowels in a string.
output -----> return first n vowels in the string

welcome to java, 1 -----> e
welcome to java, 2 -----> eo
welcome to java, 3 -----> eoe
welcome to java, 6 -----> eoeoaa 
welcome to java, 7 -----> invalid

Logic:
~~~~~~
1. read a string s from the user and integer as n.
2. fetch one by one char from the string s.
3. if char == vowel copy that char ch into a new string (ns).
4. if n>length of ns then print "invalid" otherwise
5. print characters in ns up to n characters.
 */

public class FirstNVowelsLBP074 {
	static Logger logger = Logger.getLogger(FirstNVowelsLBP074.class);

	static void firstNVowels(String text, int vowelsCount) {
		StringBuilder sb = new StringBuilder();
		text = text.toLowerCase();

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
					|| text.charAt(i) == 'u')
				sb.append((text.charAt(i)));
		}
		if (vowelsCount <= sb.toString().length()) {
			for (int i = 0; i < vowelsCount; i++)
				logger.info(sb.toString().charAt(i));
		} else
			logger.info("Invalid");

	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		int vowelsCount = myObj.nextInt();
		FirstNVowelsLBP074.firstNVowels(text, vowelsCount);
	}
}
