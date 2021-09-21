package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Write a program to check whether the given number is prime number or not. A number is said to prime if it is having only two factors. i.e. 1 and number itself.

input ------> a number from the user
constraint--> n>1
output -----> true or false

Logic:
~~~~~~
n=2 -------> 1,2 -------> true
n=3 -------> 1,3 -------> true
n=4 -------> 1,2,4 -----> false
n=5 -------> 1,5 -------> true
n=6 -------> 1,2,3,6 ---> false
.
.
n=x -------> 1,2,3,4,5,.....,x ---> if factors==2 then print true else false
 */
public class PrimeNumberLBP028 {
	static Logger logger = Logger.getLogger(PrimeNumberLBP028.class);
	static int count = 0;

	static String primeNumber(int number) {
		for (int i = 2; i <= number; i++) {
			if (number % i == 0)
				count++;
		}
		if (count == 2)
			return "Prime Number";
		else
			return "Not a Prime Number";

	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(PrimeNumberLBP028.primeNumber(number));
	}

}
