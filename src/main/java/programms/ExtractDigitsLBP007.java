package programms;

import java.util.Scanner;

import org.apache.log4j.Logger;
//Extract digits from the number
public class ExtractDigitsLBP007 {
	static Logger logger = Logger.getLogger(ExtractDigitsLBP007.class);
	static int tempNumber = 0;
	static int extracteDigit = 0;

	static int extractDigits(int number) {
		if (number >= 0) {
			while (number != 0) {
				tempNumber = number % 10;
				extracteDigit = (extracteDigit * 10) + tempNumber;
				number = number / 10;
			}
			return extracteDigit;
		} else
			return 0;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(ExtractDigitsLBP007.extractDigits(number));
	}

}
