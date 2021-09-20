package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;
//Sum of prime digits
public class SumOfPrimeDigitsLBP011 {
	static Logger logger = Logger.getLogger(SumOfPrimeDigitsLBP011.class);
	static int tempNumber = 0;
	static int sum = 0;

	static int sumOfPrimeDigit(int number) {
		while (number != 0) {
			tempNumber = number % 10;
			if (tempNumber == 2 || tempNumber == 3 || tempNumber == 5 || tempNumber == 7)
				sum += tempNumber;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(SumOfPrimeDigitsLBP011.sumOfPrimeDigit(number));

	}

}
