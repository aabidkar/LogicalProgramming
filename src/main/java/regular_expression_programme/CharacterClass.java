package regular_expression_programme;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

public class CharacterClass {
	static Logger logger = Logger.getLogger(CharacterClass.class);

	static void regEx(String pattern, String targetString) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(targetString);
		while (m.find()) {
			logger.info(m.start() + "..." + "..." + m.group());
		}
	}

	public static void main(String[] args) {
		String pattern = "[^abc]"; // Update pattern string as per requirement.
		String targetString = "a7b@z#9";
		/*
		 * [abc] - Either 'a','b' or 'c'.
		 * [^abc] - Except 'a','b' and 'c'.
		 * [a-z] - Any lower case alphabet Symbol.
		 * [A-Z] - Any upper case alphabet Symbol.
		 * [a-zA-z] - Any alphabet Symbol.
		 * [0-9] - Any Digits from 0 to 9.
		 * [a-zA-Z0-9] - Any alpha numeric symbol.
		 * [^a-zA-Z0-9] - Except alpha numeric symbol (means Special Characters).
		 */
		
		CharacterClass.regEx(pattern, targetString);

	}

}
