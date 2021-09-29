package regular_expression_programme;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Write a regular expression to represent all 10 digits mobile number Rules
i. Number should contain exactly 10 digits
ii. 1st digit should be between 7 to 9.
 */
public class ValidateMobileNumber {
	static Logger logger = Logger.getLogger(ValidateMobileNumber.class);

	static Boolean verifyValidMobileNumber(String mobileNumber) {
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m = p.matcher(mobileNumber);
		return m.matches();
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String mobileNumber = myObj.nextLine();
		logger.info(ValidateMobileNumber.verifyValidMobileNumber(mobileNumber));
	}

}
