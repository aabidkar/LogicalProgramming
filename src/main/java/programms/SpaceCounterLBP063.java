package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Space between each character

Create a function that takes a string and returns a string with spaces in between all of the characters.

input ------------> a string
constraints-------> No
output -----------> string

java -----> j a v a
prakash --> p r a k a s h
python ---> p y t h o n

Logic:
~~~~~~
1. read a string from the user as s
2. fetch each character ch from s.
3. print ch followed by space.
 */
public class SpaceCounterLBP063 {
	static Logger logger = Logger.getLogger(SpaceCounterLBP063.class);

	static int spaceCounter(String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(SpaceCounterLBP063.spaceCounter(text));

	}

}
