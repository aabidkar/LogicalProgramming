package programms;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class StringInOrderLBP075 {
	static Logger logger = Logger.getLogger(StringInOrderLBP075.class);

	static void stringInOrder(String text) {
		for (int i = 0; i < text.length() - 1; i++) {
			for (int j = 0; i < text.length() - 1; j++) {
				if (text.charAt(i) + 1 == text.charAt(j) + 1)
					logger.info(text);
				else
					logger.info(text);
			}
		}

	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		StringInOrderLBP075.stringInOrder(text);

	}

}
