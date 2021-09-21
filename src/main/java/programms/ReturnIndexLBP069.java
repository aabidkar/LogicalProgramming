package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Index of first vowel

create a function that returns the index of first vowel in a string

input ------> a string
con --------> no
output -----> an int value

test ------> e(1) -------------> 1
welcome ---> e(1),o(4),e(6) ---> 1
python ----> o(4) -------------> 4
012345

Logic:
~~~~~~
1. read a string from the user as s.
2. read character from string s one by one and store in ch.
3. if first occurrence of ch is in vowels, then return index.
 */
public class ReturnIndexLBP069 {
	static Logger logger = Logger.getLogger(ReturnIndexLBP069.class);

	static int returnIndex(String text) {
		text = text.toLowerCase();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
					|| text.charAt(i) == 'u')
				return i;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(ReturnIndexLBP069.returnIndex(text));

	}

}
