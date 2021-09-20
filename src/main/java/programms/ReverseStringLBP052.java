package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Reverse of a String
public class ReverseStringLBP052 {
	static Logger logger = Logger.getLogger(ReverseStringLBP052.class);

	static void reverse(String text) {
		for (int i = text.length() - 1; i >= 0; i--)
			logger.info(text.charAt(i));
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		ReverseStringLBP052.reverse(text);
	}

}
