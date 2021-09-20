package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Sum of prime number between range
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
