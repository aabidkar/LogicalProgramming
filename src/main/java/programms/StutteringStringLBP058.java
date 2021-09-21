package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
write a function that shutters a word as if someone is struggling to read it. 
The first two letters are repeated twice with an ellipsis ... , and then the word is pronounced with a question mark?

input ------------> a string
Constraint --------> no
output -----------> xx... xx... ~~~~~~~?


abc =====> ab...ab...abc?

s=abc
r=ab...ab...abc?

Logic:
~~~~~~
1. read a string from the user
2. create an empty string
3. copy first two character and ...
4. copy first two characters and ...
5. copy the content of s to new string
6. append ? mark at the end.
7. print new string
 */
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
