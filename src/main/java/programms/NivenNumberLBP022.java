package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Write a program to accept a number and check and display whether it is a Niven Number or not.
Niven Number is that a number which is divisible by its sum of digits.

input -----> a number
constraint-> n>0
output ----> Niven Number or Not

Logic:
------
1. read a number from user
2. calculate sum of its digits.
3. divide the original number with sum of its digits
4. if it is divisible then print Niven Number else Not.
 */
public class NivenNumberLBP022 {
	static Logger logger = Logger.getLogger(NivenNumberLBP022.class);
	static int tempNumber = 0;
	static int sum = 0;
	static int copyNumber = 0;

	static String nivenNumber(int number) {
		copyNumber = number;
		while (copyNumber != 0) {
			tempNumber = copyNumber % 10;
			sum += tempNumber;
			copyNumber /= 10;
		}
		if (number % sum == 0)
			return "Niven Number";
		else
			return "Not a Niven Number";
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(NivenNumberLBP022.nivenNumber(number));

	}

}
