package programms;

import java.util.Scanner;

import org.apache.log4j.Logger;

/*
Given an integer n, perform the following conditional actions,
if n is odd, print weird,
if n is even and in the inclusive range of 2 to 5, print Not Weird.
if n is even and in the inclusive range of 6 to 20, print Weird.
if n is even and greater than 20, print Not Weird.

input-----> a number from the user
Constraint-> 1<=n<=100
output----> Weird or Not Weird
 */
public class NumberWeirdNotWeirdLBP002 {
	static Logger logger = Logger.getLogger(NumberWeirdNotWeirdLBP002.class);

	static String numberWeirdNotWeird(int number) {
		if (number >= 0 && number <= 100) {
			if (number % 2 == 1)
				return "Weird";
			else {
				if (number >= 2 && number <= 5)
					return "Not Weird";
				else if (number >= 6 && number <= 20)
					return "Weird";
				else
					return "Not Weird";
			}
		} else
			return "Out of Range Number";
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(NumberWeirdNotWeirdLBP002.numberWeirdNotWeird(number));
	}

}
