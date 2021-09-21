package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Implement a program to calculate sum of prime digits present in the given number

input -------------> a number from the user
constraint --------> n>0
output ------------> print sum of prime digits
 */
public class SumOfPrimeDigitsLBP010 {
	static Logger logger = Logger.getLogger(SumOfPrimeDigitsLBP010.class);
	static int tempNumber = 0;
	static int sum = 0;

	static int sumOfPrimeDigits(int number) {
		if (number >= 0) {
			while (number != 0) {
				tempNumber = number % 10;
				if (tempNumber == 2 || tempNumber == 3 || tempNumber == 5 || tempNumber == 7)
					sum += tempNumber;
				number /= 10;
			}
			return sum;
		} else
			return 0;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(SumOfPrimeDigitsLBP010.sumOfPrimeDigits(number));

	}

}
