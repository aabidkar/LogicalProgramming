package regular_expression_programme;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

//We can user quantifiers to specify number of express to match.
public class Quantifiers {
	static Logger logger = Logger.getLogger(Quantifiers.class);

	static void regEx(String pattern, String targetString) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(targetString);
		while (m.find()) {
			logger.info(m.start() + "..." + "..." + m.group());
		}
	}

	public static void main(String[] args) {
		String pattern = "[a]"; // Update pattern string as per requirement.
		String targetString = "abaabaaab";
		/*
		 * Example-
		 * a - Exactly one a.
		 * a+ - Atleast one a.
		 * a* - Any number of a's including zero number also.
		 * a? - atmost one a.
		 */
		Quantifiers.regEx(pattern, targetString);

	}

}
