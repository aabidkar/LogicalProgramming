package programms;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class HexStringLBP075 {
	static Logger logger = Logger.getLogger(HexStringLBP075.class);

	static String hexString(String text) {
		int count = 0;
		for (int i = 1; i < text.length(); i++) {
			if ((text.charAt(0) == '#') && (text.length() == 6)||((text.charAt(i) >= '0') && (text.charAt(i) <= '9')) || ((text.charAt(i) >= 'A') && (text.charAt(i) <= 'F'))||((text.charAt(i) >= 'a') && (text.charAt(i) <= 'f'))) {
				count++;
			}
		}
		if (count == text.length() - 1)

			return "String is hex.";
		else
			return "Not a Hex String.";
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(HexStringLBP075.hexString(text));

	}

}
