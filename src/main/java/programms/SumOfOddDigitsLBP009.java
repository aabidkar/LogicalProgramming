package programms;

import java.util.Scanner;

import org.apache.log4j.Logger;

//Sum of odd digits
public class SumOfOddDigitsLBP009 {
	static Logger logger = Logger.getLogger(SumOfOddDigitsLBP009.class);
	static int tempNumber = 0;
	static int sumofDigit = 0;

	static int sumOfOddDigits(int number) {
		while (number != 0) {
			tempNumber = number % 10;
			if (tempNumber % 2 == 1)
				sumofDigit = tempNumber + sumofDigit;
			number = number / 10;
		}
		return sumofDigit;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(SumOfOddDigitsLBP009.sumOfOddDigits(number));

	}

}
