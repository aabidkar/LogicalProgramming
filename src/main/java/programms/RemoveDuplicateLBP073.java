package programms;

import java.util.Scanner;
/*
Removing Duplicate Characters from a string

Given a string S, the task is to remove all the duplicates in the given string. 

input --------> a string from the user
con ----------> remove all duplicates
output -------> a string without duplicates


hello -----> helo
program ---> progam

Logic:
~~~~~~
1. read a string s from the user.
2. fetch one by one character from s.
3. compare the character ch with remaining all the characters.
4. if duplicate found, move next char to current position.
5. print updated string.
 */

import org.apache.log4j.Logger;

public class RemoveDuplicateLBP073 {
	static Logger logger = Logger.getLogger(RemoveDuplicateLBP073.class);

	static String removeDuplicate(String text) {
		int i;
		String temp = "";
		for (i = 0; i < text.length(); i++) {
			if (temp.indexOf(text.charAt(i)) < 0) {
				temp += text.charAt(i);
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(RemoveDuplicateLBP073.removeDuplicate(text));

	}

}
