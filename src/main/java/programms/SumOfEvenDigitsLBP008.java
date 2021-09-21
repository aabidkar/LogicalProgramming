package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Implement a program to calculate sum of digits present in the given number

input -------------> a number from the user
constraint --------> n>0
output ------------> print sum of digits
 */
public class SumOfEvenDigitsLBP008 {
	static Logger logger = Logger.getLogger(SumOfEvenDigitsLBP008.class);
	static int tempNumber = 0;
	static int sumofDigit = 0;

	static int sumOfEvenDigits(int number) {
		while (number != 0) {
			tempNumber = number % 10;
			if (tempNumber % 2 == 0) {
				sumofDigit = tempNumber + sumofDigit;
			}
			number = number / 10;
		}
		return sumofDigit;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(SumOfEvenDigitsLBP008.sumOfEvenDigits(number));
	}
}
