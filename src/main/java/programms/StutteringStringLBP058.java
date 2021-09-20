package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Stuttering String
public class StutteringStringLBP058 {
	static Logger logger = Logger.getLogger(StutteringStringLBP058.class);

	static String stutteringString(String text) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 2; i++) {
			sb.append(text.charAt(0));
			sb.append(text.charAt(1));
			sb.append("...");
		}
		sb.append(text);
		sb.append("?");
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(StutteringStringLBP058.stutteringString(text));

	}

}
