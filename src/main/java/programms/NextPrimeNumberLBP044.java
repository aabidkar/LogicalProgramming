package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Find next prime number
public class NextPrimeNumberLBP044 {
	static Logger logger = Logger.getLogger(NextPrimeNumberLBP044.class);

	static boolean nextPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		for (int i = number;; i++)
			if (nextPrime(i)) {
				logger.info(i);
				break;
			}
	}
}
