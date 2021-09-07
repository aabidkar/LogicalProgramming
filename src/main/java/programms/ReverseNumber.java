package programms;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class ReverseNumber {
	static int tempNumber;
	static int sum = 0;
	static Logger logger=Logger.getLogger(ReverseNumber.class);
	public static int reverseOfNumber(int number) {
		if (number >= 0) {
			while (number != 0) {
				tempNumber = number % 10;
				sum = (sum * 10) + tempNumber;
				logger.info(tempNumber + " ");
				number = number / 10;
			}
		} else
			logger.info("Invalid Number");
		return 0;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		ReverseNumber.reverseOfNumber(number);

	}

}