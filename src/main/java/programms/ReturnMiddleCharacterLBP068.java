package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Returns the middle character of a string

create a function that takes a string and returns, the middle character(s). 
if the word's length is odd return the midlle character.
if the word's length is even, return the middle two characters.

input -----> a string from the user
constraint-> no
output ----> middle character(s)

abc -----> 3 -> Odd ====> b
xyz -----> 3 -> Odd ====> y
abcde ---> 5 -> Odd ====> c
abcd ----> 4 -> Even ===> bc 
middle --> 6 -> Even ===> dd
012345

23

Logic:
~~~~~~
1. read a string from the user.
2. store length of the string in n.
3. if n is even ====> s[n/2-1],s[n/2]
4. if n is odd =====> s[n/2]

if index concept is there =====> [i]
if index concept is not there => charAt(i)

 */
public class ReturnMiddleCharacterLBP068 {
	static Logger logger = Logger.getLogger(ReturnMiddleCharacterLBP068.class);

	static String returnMiddleCharacter(String text) {
		StringBuilder sb = new StringBuilder();
		int length = text.length();
		for (int i = 0; i < length; i++)
			if (length % 2 == 0) {
				sb.append(text.charAt((length / 2) - 1));
				return sb.append(text.charAt(length / 2)).toString();
			}
		return sb.append(text.charAt(length / 2)).toString();
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(ReturnMiddleCharacterLBP068.returnMiddleCharacter(text));
	}
}
