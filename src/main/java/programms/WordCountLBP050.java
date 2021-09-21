package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Get word count

Create a function/method that takes a string and return the word count. 
The string will be a sentence.

Input: A string 
Constraints: No 
Output: Word count

Logic:
~~~~~~~
1. read a string from the user.
2. repeat a loop and search for spaces, counter++
3. print counter+1 ---> number of words in the given string.
 */
public class WordCountLBP050 {
	static Logger logger = Logger.getLogger(WordCountLBP050.class);

	static int wordCount(String text) {
		int count = 1;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(WordCountLBP050.wordCount(text));
	}
}
