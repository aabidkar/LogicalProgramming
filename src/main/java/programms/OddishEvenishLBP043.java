package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Check sum of the number is even or odd
public class OddishEvenishLBP043 {
	static Logger logger = Logger.getLogger(OddishEvenishLBP043.class);

	static String oddishEvenish(int number) {
		int tempNumber = 0;
		int sum = 0;
		while (number != 0) {
			tempNumber = number % 10;
			sum += tempNumber;
			number /= 10;
		}
		if (sum % 2 == 0)
			return "Evenish";
		else
			return "Oddish";
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(OddishEvenishLBP043.oddishEvenish(number));
	}

}
