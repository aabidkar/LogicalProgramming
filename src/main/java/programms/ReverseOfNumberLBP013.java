package programms;

import java.util.Scanner;

import org.apache.log4j.Logger;
//Reverse of a given number
public class ReverseOfNumberLBP013 {
	static Logger logger = Logger.getLogger(ReverseOfNumberLBP013.class);
	static int tempNumber = 0;
	static int reverse = 0;

	static int reverseOfNumber(int number) {
		while (number != 0) {
			tempNumber = number % 10;
			reverse = reverse * 10 + tempNumber;
			number /= 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(ReverseOfNumberLBP013.reverseOfNumber(number));

	}

}
