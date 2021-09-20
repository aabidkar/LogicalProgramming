package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Prime number
public class PrimeNumberLBP028 {
	static Logger logger = Logger.getLogger(PrimeNumberLBP028.class);
	static int count = 0;

	static String primeNumber(int number) {
		for (int i = 2; i <= number; i++) {
			if (number % i == 0)
				count++;
		}
		if (count == 2)
			return "Prime Number";
		else
			return "Not a Prime Number";

	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(PrimeNumberLBP028.primeNumber(number));
	}

}
