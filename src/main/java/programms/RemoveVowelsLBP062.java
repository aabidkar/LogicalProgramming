package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Remove Every vowel from a String

Create a function that takes a string and returns a new string with all vowels removed. 

input -------------> a string 
constraints -------> No
output ------------> a string

welcome ------> wlcm
prakash ------> prksh

Note: Search, Replacement, Removal --------> Regular Expression

Logic:
~~~~~~
1. read a string from the user as s1
2. create an empty string as s2
3. copy each character from s1 to s2 if ch is not a vowel
4. print s2
 */
public class RemoveVowelsLBP062 {
	static Logger logger = Logger.getLogger(RemoveVowelsLBP062.class);

	static String removeVowels(String text) {
		text = text.toLowerCase();
		int i = 0;
		StringBuilder sb = new StringBuilder();
		for (i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
					|| text.charAt(i) == 'u')
				continue;
			else
				sb.append(text.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(RemoveVowelsLBP062.removeVowels(text));
	}
}
