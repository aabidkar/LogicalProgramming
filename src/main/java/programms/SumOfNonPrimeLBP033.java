package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
The IT company "Soft ComInfo" has decided to transfer its messages through the N/W using new encryption technique. The company has decided to encrypt the data using the non-prime number concept. The message is in the form of a number and the sum of non-prime digits present in the message is used as the encryption key.

Write an algorithm to determine the encryption key.

input ------> The input consists of an integer numMsg representing the numeric form of the message.

output ------> print an integer representing the encryption key.

note: Digit 1 and 0 are considered as a prime number.

prime digits -----> 0,1,2,3,5,7
non-prime --------> 4,6,8,9

Logic:
~~~~~~
1-------> read a number numMsg from the user
2-------> find non-prime digits
3 ------> all these non prime digits store it in key
4 ------> print the value of key
 */
public class SumOfNonPrimeLBP033 {
	static Logger logger = Logger.getLogger(SumOfNonPrimeLBP033.class);
	static int tempNumber = 0;
	static int sum = 0;

	static int sumofNonPrime(int number) {
		while (number != 0) {
			tempNumber = number % 10;
			if (tempNumber == 4 || tempNumber == 6 || tempNumber == 8 || tempNumber == 9)
				sum += tempNumber;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(SumOfNonPrimeLBP033.sumofNonPrime(number));
	}
}
