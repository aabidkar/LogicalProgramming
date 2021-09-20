package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Count number of space available in a string
public class SpaceCounterLBP063 {
	static Logger logger = Logger.getLogger(SpaceCounterLBP063.class);

	static int spaceCounter(String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(SpaceCounterLBP063.spaceCounter(text));

	}

}
