package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Count number of digits
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
