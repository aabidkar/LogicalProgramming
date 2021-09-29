package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Implement the following function

the function accepts two +ve integers n1 and n2 as its arguments.
Implement the function on given two values to return an int value as follows

return whichever value is nearest to 21 without going over. Return if they go both go over.

input --------> two int values n1 and n2
constraint ---> no
output -------> 0 or n1 or n2

Logic:
~~~~~~
1 ----------------> read two numbers
2 ----------------> if both are >21 then return 0
3 ----------------> if n1>21, then return n2
4 ----------------> if n2>21, then return n1
5 ----------------> biggest among n1 & n2

22,22----->0
22,19 ---->19
18,22 ---->18
19,18 ---->19
 */
public class BlackJackV1LBP037 {
	static Logger logger = Logger.getLogger(BlackJackV1LBP037.class);

	static int blackJack(int numberOne, int numberTwo) {
		if (numberOne > 21 && numberTwo > 21)
			return 0;
		else if (numberOne > 21)
			return numberTwo;
		else if (numberTwo > 21)
			return numberOne;
		else
			return (numberOne > numberTwo) ? numberOne : numberTwo;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int numberOne = myObj.nextInt();
		int numberTwo = myObj.nextInt();
		logger.info(BlackJackV1LBP037.blackJack(numberOne, numberTwo));
	}

}