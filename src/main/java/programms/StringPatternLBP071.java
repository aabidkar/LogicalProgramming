package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//String pattern programme
public class StringPatternLBP071 {
	static Logger logger = Logger.getLogger(StringPatternLBP071.class);

	static void stringPattern(String text) {
		for (int i = 0; i < text.length(); i++) {
			for (int j = i; j < text.length(); j++) {
				logger.info(text.charAt(j));
			}
		}

	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		StringPatternLBP071.stringPattern(text);

	}

}
