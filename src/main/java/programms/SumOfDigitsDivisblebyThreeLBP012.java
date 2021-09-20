package programms;

import java.util.Scanner;

import org.apache.log4j.Logger;
//Calculate sum of digits divisble by three
public class SumOfDigitsDivisblebyThreeLBP012 {
	static Logger logger = Logger.getLogger(SumOfDigitsDivisblebyThreeLBP012.class);
	static int tempNumber = 0;
	static int sum = 0;

	static int sumOfDigits(int number) {
		while (number != 0) {
			tempNumber = number % 10;
			if (tempNumber % 3 == 0)
				sum += tempNumber;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(SumOfDigitsDivisblebyThreeLBP012.sumOfDigits(number));

	}

}
