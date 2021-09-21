package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Andy, Ben and Charlotte are playing a board game. 
The three of them decided to come up with a new scoring system. 
A player's first initial ("A","B" & "C") denotes that players scoring a single point.
Given a string of capital letters. returns an array of the player's scores.

input --------------> A String
constraint ---------> No
output -------------> score

A ---------------> 1 0 0
AB --------------> 1 1 0
ABC -------------> 1 1 1
AABBC -----------> 2 2 1

Logic:
~~~~~~
1. read a string from the user as s   //ABC
2. fetch every character from s as ch //A,B,C
3. if ch is equal to A then a++
4. if ch is equal to B then b++
5. if ch is equal to C then c++
6. print a b c
 */
public class BoardGameLBP061 {
	static Logger logger = Logger.getLogger(BoardGameLBP061.class);

	static void boardGame(String text) {
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a' || text.charAt(i) == 'A')
				aCount++;
			else if (text.charAt(i) == 'b' || text.charAt(i) == 'B')
				bCount++;
			else
				cCount++;
		}
		logger.info(aCount);
		logger.info(bCount);
		logger.info(cCount);
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		BoardGameLBP061.boardGame(text);

	}

}
