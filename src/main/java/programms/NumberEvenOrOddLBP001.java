package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;
//Program to check whether the given number is an even or odd number.
public class NumberEvenOrOddLBP001 {
	static Logger logger = Logger.getLogger(NumberEvenOrOddLBP001.class);
	static String numberEvenOrOdd(int number) {
		if (number >= 0) {
			if (number % 2 == 0)
				return "Even Number";
			else
				return "Odd Number";
		} else
			return "Invalid Number";
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(NumberEvenOrOddLBP001.numberEvenOrOdd(number));
	}
}
