package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Compare string ending
public class CompareStringEndLBP051 {
	static Logger logger = Logger.getLogger(CompareStringEndLBP051.class);

	static boolean stringCompare(String text, String compare) {
		int j = 0;
		int count = 0;
		for (int i = text.length() - compare.length(); i < text.length(); i++, j++) {
			if (compare.charAt(j) == text.charAt(i))
				count++;
		}
		return count == compare.length();
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		String compare = myObj.nextLine();
		logger.info(CompareStringEndLBP051.stringCompare(text, compare));

	}

}
