package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Count number of words are available
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
