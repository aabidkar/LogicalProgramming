package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Sum of Non Prime Number
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
