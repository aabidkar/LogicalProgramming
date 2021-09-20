package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Board Game Score
public class BoardGameLBP061 {
	static Logger logger = Logger.getLogger(BoardGameLBP061.class);

	static void boardGame(String text) {
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a' || text.charAt(i) == 'A')
				aCount++;
			else if (text.charAt(i) == 'b' || text.charAt(i) == 'B')
				bCount++;
			else
				cCount++;
		}
		logger.info(aCount);
		logger.info(bCount);
		logger.info(cCount);
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		BoardGameLBP061.boardGame(text);

	}

}
