package regular_expression_programme;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class PreDefinedCharacterClass {
	static Logger logger = Logger.getLogger(PreDefinedCharacterClass.class);

	static void regEx(String pattern, String targetString) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(targetString);
		while (m.find()) {
			logger.info(m.start() + "..." + "..." + m.group());
		}
	}

	public static void main(String[] args) {
		String pattern = "[\\w]"; // Update pattern string as per requirement.
		String targetString = "a7b k@9";
		/*
		 * \\s - Space character.
		 * \\S - Any character Except Space.
		 * \\d - Any digit from [0-9].
		 * \\D - Any character except digit.
		 * \\w - Any word character [a-z A-Z 0-9]
		 * \\W - Except word character (Special Character).
		 *  \\. - Any symbol including special character.
		 */
		
		PreDefinedCharacterClass.regEx(pattern, targetString);
	}

}
