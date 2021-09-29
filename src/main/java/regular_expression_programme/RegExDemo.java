package regular_expression_programme;

import java.util.regex.*;
import org.apache.log4j.Logger;

public class RegExDemo {
	static Logger logger = Logger.getLogger(RegExDemo.class);

	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("[abc]");
		Matcher m = p.matcher("abaabaaab");
		while (m.find()) {
			count++;
			logger.info(m.start() + "..." + m.end() + "..." + m.group());
		}
		logger.info(count);
	}
}
