package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;
/*
A special two digit number is a number such that when the sum of its digits is added to the product of its digits, the result should be equal to the original two-digit number.

Implement a program to accept a two digit number and check whether it is a special two digit number or not.

input -----> a two digit number
constraint-> 10<=n<=99
output ----> special two digit number or not

Logic:

1. extract digits from the given number.
2. cal new number = sum of those digits + product of those digits.
3. compare new number with old number.
4. if equal print "A special two digit number" else "not"
 */
public class SpecialTwoDigitsNumberLBP023 {
	static Logger logger = Logger.getLogger(SpecialTwoDigitsNumberLBP023.class);
	static int tempNumber = 0;
	static int sum = 0;
	static int mul = 1;
	static int copyNumber = 0;

	static String specialTwoDigitNumebr(int number) {
		copyNumber = number;
		while (copyNumber != 0) {
			tempNumber = copyNumber % 10;
			sum += tempNumber;
			mul *= tempNumber;
			copyNumber /= 10;
		}
		if (number == (sum + mul))
			return "Special Two Digit Number";
		else
			return "Not a Speical Two Digit Number";

	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(SpecialTwoDigitsNumberLBP023.specialTwoDigitNumebr(number));

	}

}
