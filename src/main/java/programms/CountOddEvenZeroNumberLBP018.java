package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Count odd even zero number
public class CountOddEvenZeroNumberLBP018 {
	static Logger logger = Logger.getLogger(CountOddEvenZeroNumberLBP018.class);
	static int tempNumber = 0;
	static int zeroCount = 0;
	static int evenCount = 0;
	static int oddCount = 0;

	static int countOddEvenZeroNumber(int number) {
		do {
			tempNumber = number % 10;
			if (tempNumber == 0)
				zeroCount++;
			else if (tempNumber % 2 == 0)
				evenCount++;
			else
				oddCount++;
			number /= 10;
		} while (number != 0);
		return 0;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		CountOddEvenZeroNumberLBP018.countOddEvenZeroNumber(number);
		logger.info(zeroCount);
		logger.info(evenCount);
		logger.info(oddCount);

	}

}
