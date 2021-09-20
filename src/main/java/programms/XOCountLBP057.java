package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Count X and O in a string
public class XOCountLBP057 {
	static Logger logger = Logger.getLogger(XOCountLBP057.class);

	static boolean xoCount(String text) {
		int xCount = 0;
		int oCount = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'x' || text.charAt(i) == 'X')
				xCount++;
			if (text.charAt(i) == 'o' || text.charAt(i) == 'O')
				oCount++;
		}
		return xCount == oCount;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(XOCountLBP057.xoCount(text));

	}

}
