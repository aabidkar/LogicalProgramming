package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//returns the index of first vowel in a string
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
