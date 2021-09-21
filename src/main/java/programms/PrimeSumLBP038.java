package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
A company wishes to devise an order confirmation procedure. 
They plan to require an extra confirmation instead of simply auto-confirming the order at the time it is placed. 
for this purpose, 
the system will generate one time password to be shared with the customer.
The customer who is placing the order has to enter the OTP to confirm the order.
The OTP generated for the requested order ID, as the product of the digits in orderID. 

Write an algorithm to find the OTP for the OrderID.

input -----> an integer representing order id
output ----> an integer representing OTP

Logic:
~~~~~~
1 ----------------> read order id
2 ----------------> split order id into digits
3 ----------------> multiply each and every digit
4 ----------------> return the product as OTP
 */
public class PrimeSumLBP038 {
	static Logger logger = Logger.getLogger(PrimeSumLBP038.class);
	static int sum = 0;

	static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	static int primeRange(int numberOne, int numberTwo) {
		for (int i = numberOne; i <= numberTwo; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int numberOne = myObj.nextInt();
		int numberTwo = myObj.nextInt();
		logger.info(PrimeSumLBP038.primeRange(numberOne, numberTwo));

	}

}
