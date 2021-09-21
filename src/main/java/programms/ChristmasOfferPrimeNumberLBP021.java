package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
An e-commerce company plans to give their customers a special discount for the Christmas, they are planning to offer a flat discount. The discount value is calculated as the sum of all prime digits in the total bill amount.

Write an algorithm to find the discount value for the given total bill amount.

input ----> the input consists of an integer order value representing the total bill amount
condition-> no conditions
output ---> print an integer representing discount value for the given total bill amount.

Logic:

1 ----> read total bill amount from the user.
2 ----> call sumofprimedigits(bill_amount)
3 ----> the returned value is nothing but result discount.

list of single digit prime numbers ---> [2,3,5,7]
 */
public class ChristmasOfferPrimeNumberLBP021 {
	static Logger logger = Logger.getLogger(ChristmasOfferPrimeNumberLBP021.class);
	static int tempNumber = 0;
	static int sum = 0;

	static int christmasOfferPrimeNumber(int number) {
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
		logger.info(ChristmasOfferPrimeNumberLBP021.christmasOfferPrimeNumber(number));
	}

}
