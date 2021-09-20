package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Find max min from the given number
public class FindMaxMinNumberLBP019 {
	static Logger logger = Logger.getLogger(FindMaxMinNumberLBP019.class);
	static int tempNumber = 0;
	static int max = -9;
	static int min = 9;

	static int findMaxMinNumber(int number) {
		while (number != 0) {
			tempNumber = number % 10;
			if (max < tempNumber)
				max = tempNumber;
			if (min > tempNumber)
				min = tempNumber;
			number /= 10;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		FindMaxMinNumberLBP019.findMaxMinNumber(number);
		logger.info(max);
		logger.info(min);
	}
}
