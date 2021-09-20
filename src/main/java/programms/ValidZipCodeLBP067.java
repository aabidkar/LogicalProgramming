package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Validate a valid Zip code
public class ValidZipCodeLBP067 {
	static Logger logger = Logger.getLogger(ValidZipCodeLBP067.class);

	static boolean validateZipCode(String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 48 && text.charAt(i) <= 57)
				count++;
		}
		return count == 5;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(ValidZipCodeLBP067.validateZipCode(text));

	}

}
