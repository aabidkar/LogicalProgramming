package programms;

import java.util.Scanner;

import org.apache.log4j.Logger;
/*
Given an integer x, return x with its digits reversed. 

input---------> a number from user
constraint ---> n>=0
output -------> reverse of the given number
 */
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
