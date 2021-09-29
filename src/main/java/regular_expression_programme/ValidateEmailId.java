package regular_expression_programme;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class ValidateEmailId {
	static Logger logger = Logger.getLogger(ValidateEmailId.class);

	static Boolean validateEmailId(String emailId) {
		Pattern p = Pattern.compile("[a-zA-Z0-9_.]*@gmail[.]com");
		Matcher m = p.matcher(emailId);
		return m.matches();

	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String emailId = myObj.nextLine();
		logger.info(ValidateEmailId.validateEmailId(emailId));

	}

}
