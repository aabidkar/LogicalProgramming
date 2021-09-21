package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Given an integer, create a function that returns the next prime. If the number is prime, return the number itself.

input ----------> a number
constraint -----> prime number
output ---------> prime number

10---->11
11---->11
14---->17 etc

Logic:
~~~~~~
1. read a number 'n' from the user.
2. run a looping statement
	for i starts from 'n' and run an infinate loop
	100 -----> ..............x stop (break)
3. check every number if it is a prime then return.
4. else repeat
 */
public class NextPrimeNumberLBP044 {
	static Logger logger = Logger.getLogger(NextPrimeNumberLBP044.class);

	static boolean nextPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		for (int i = number;; i++)
			if (nextPrime(i)) {
				logger.info(i);
				break;
			}
	}
}
