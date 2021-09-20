package programms;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class AddSpaceLBP065 {
	static Logger logger = Logger.getLogger(AddSpaceLBP065.class);

	static String addSpace(String text) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			sb.append(text.charAt(i));
			sb.append(' ');
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(AddSpaceLBP065.addSpace(text));

	}

}
