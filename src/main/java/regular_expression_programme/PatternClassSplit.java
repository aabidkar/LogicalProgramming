package regular_expression_programme;

import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class PatternClassSplit {
	static Logger logger = Logger.getLogger(PatternClassSplit.class);

	static void regEx(String pattern, String targetString) {
		Pattern p = Pattern.compile(pattern);
		String[] s = p.split(targetString);
		for (String s1 : s) {
			logger.info(s1);
		}
	}

	public static void main(String[] args) {
		String pattern = "[\\s]"; // Update pattern string as per requirement.
		String targetString = "Durga Software Solution";
		PatternClassSplit.regEx(pattern, targetString);
	}

}
