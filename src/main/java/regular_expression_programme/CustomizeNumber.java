package regular_expression_programme;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
Rules
1. Allowed Character are
a-z, A-Z, 0-9, #, $

2. Min it should have atleast 2 character
3. First character should be symbol from a to k
4. Second character should be divisible by 3 [0,3,6,9]
 */

public class CustomizeNumber {
	static Logger logger = Logger.getLogger(CustomizeNumber.class);

	static Boolean validateNumber(String number) {
		Pattern p = Pattern.compile("[a-k][0369][a-zA-Z0-9#$]*");
		Matcher m = p.matcher(number);
		return m.matches();

	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String number = myObj.nextLine();
		logger.info(CustomizeNumber.validateNumber(number));

	}

}
