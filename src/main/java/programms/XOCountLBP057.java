package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Create a function that takes a string, 
check if it has the same number of x's and o's and returns either true or false.

Rules:

1. return boolean value true or false.
2. returns true if the amount x's and o's are the same.
3. returns false if they are not the same amount.
4. the string can contains any character.
5. when 'x' and 'o' are not in the string, return true.

input ---------> a string
constraints----> no
output --------> true or false

Logic:
~~~~~~
1. read a string from the user.
2. fetch char by char if it is 'x' the xc++ or if it is 'o' then oc++
3. if xc=0 and oc=0 then print true
	3.1: if xc==oc then print true
	3.2: else print false
 */
public class XOCountLBP057 {
	static Logger logger = Logger.getLogger(XOCountLBP057.class);

	static boolean xoCount(String text) {
		int xCount = 0;
		int oCount = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'x' || text.charAt(i) == 'X')
				xCount++;
			if (text.charAt(i) == 'o' || text.charAt(i) == 'O')
				oCount++;
		}
		return xCount == oCount;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(XOCountLBP057.xoCount(text));

	}

}
