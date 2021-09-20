package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Count number of vowels in a string
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
