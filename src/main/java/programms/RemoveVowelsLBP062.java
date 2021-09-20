package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Remove Vowels from the String
public class RemoveVowelsLBP062 {
	static Logger logger = Logger.getLogger(RemoveVowelsLBP062.class);

	static String removeVowels(String text) {
		text = text.toLowerCase();
		int i = 0;
		StringBuilder sb = new StringBuilder();
		for (i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
					|| text.charAt(i) == 'u')
				continue;
			else
				sb.append(text.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(RemoveVowelsLBP062.removeVowels(text));
	}
}
