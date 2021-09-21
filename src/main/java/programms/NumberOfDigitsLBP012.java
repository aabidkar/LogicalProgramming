package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Implement a program to calculate number of digits in the given number

input -------------> a number from the user
constraint --------> n>0
output ------------> print number of digits in the number
 */
public class NumberOfDigitsLBP012 {
	static Logger logger = Logger.getLogger(NumberOfDigitsLBP012.class);
	static int tempNumber = 0;
	static int count = 0;

	static int numberOfDigits(int number) {
		while (number != 0) {
			tempNumber = number % 10;
			count++;
			number /= 10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(NumberOfDigitsLBP012.numberOfDigits(number));

	}

}
