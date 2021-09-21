package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Create a function that takes a string and returns the number of vowels contained within it.

input -----------> a string
constraint ------> no
output ----------> number of vowels


Logic:
~~~~~~
1. read a string from the user
2. fetch each character and check whether it is equal to 'a' or 'e' or 'i' or 'o' or 'u' then counter++
3. print counter.
 */
public class CountVowelsLBP056 {
	static Logger logger = Logger.getLogger(CountVowelsLBP056.class);

	static int countVowels(String text) {
		int count = 0;
		text = text.toLowerCase();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
					|| text.charAt(i) == 'u')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(CountVowelsLBP056.countVowels(text));
	}
}
