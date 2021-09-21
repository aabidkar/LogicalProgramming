package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Write a function that finds the word "bomb" in the given string (not case sensitive) return "DUCK!" if found, else return "Relax there's no bomb."

input ---------> a string
constraint ----> no
output --------> "DUCK!" or "Relax, There's no bomb."
 

Logic:
~~~~~~~
1. read a string from the user.
2. convert the string into lowercase.
3. search for bomb word in the string.
4. if result is true then print "DUCK!".
5. if result is not found then print "Relax, There's no bomb."
 */
public class FindTheBombLBP055 {
	static Logger logger = Logger.getLogger(FindTheBombLBP055.class);

	static String findTheBomb(String text, String bomb) {
		int count = 0;
		int i = 0;
		text = text.toLowerCase();
		for (i = 0; i < text.length(); i++) {
			for (int j = 0; j < bomb.length(); i++, j++) {
				if (bomb.charAt(j) != text.charAt(i)) {
					break;
				}
				count++;
			}
		}
		if (count == bomb.length())
			return "DUCK";
		else
			return "Relax, there is no Bomb.";
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		String bomb = "bomb";
		logger.info(FindTheBombLBP055.findTheBomb(text, bomb));
	}
}
