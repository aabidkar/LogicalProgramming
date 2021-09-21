package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Create a function that takes a word and returns true if the word has two consecutive identical letters.

input ---------> A string
constraint-----> No
output --------> true or false

abbc -----> true
abcd -----> false
abab -----> false

Logic:
~~~~~
1. read a string from the user
2. declare found as false
3. if ith element and i+1th element are same, then assign found=true
4. else found =false
5. print found value
 */
public class DoubleLettersLBP060 {
	static Logger logger = Logger.getLogger(DoubleLettersLBP060.class);

	static boolean doubleLetters(String text) {
		text = text.toLowerCase();
		for (int i = 0; i < text.length() - 1; i++) {
			if (text.charAt(i) == text.charAt(i + 1))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(DoubleLettersLBP060.doubleLetters(text));
	}
}