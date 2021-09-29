package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class PermutationStringLBP072 {
	static Logger logger = Logger.getLogger(PermutationStringLBP072.class);

	static String permutationString(String text) {
		String source = text;
		StringBuilder sb = new StringBuilder();
		sb.append(text);
		sb.append(' ');
		for (int i = source.length() - 1; i >= 0; i--) {
			sb.append(source.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(PermutationStringLBP072.permutationString(text));
	}
}
