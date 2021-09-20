package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Sum of digits between range
public class SumOfDigitsBetweenLBP046 {
	static Logger logger = Logger.getLogger(SumOfDigitsBetweenLBP046.class);

	static int sumOfDigits(int number) {
		int tempNumber = 0;
		int sum = 0;
		while (number != 0) {
			tempNumber = number % 10;
			sum += tempNumber;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int numberOne = myObj.nextInt();
		int numberTwo = myObj.nextInt();
		int sum = 0;
		for (int i = numberOne; i <= numberTwo; i++) {
			sum += sumOfDigits(i);
		}
		logger.info(sum);
	}

}
