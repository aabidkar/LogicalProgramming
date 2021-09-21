package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
create a method/function that takes a string as its argument and returns the string in reversed order.

input ---------> a string 
constraint ----> no
output --------> reversed string

Hello ----------> olleH
Hello World ----> dlroW olleH

Logic:
~~~~~~~
1. read s
2. print each character from end to begin
 */
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
