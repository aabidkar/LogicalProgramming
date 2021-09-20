package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Perfect number
public class PerfectNumberLBP041 {
	static Logger logger = Logger.getLogger(PerfectNumberLBP041.class);

	static boolean perfectNumber(int number) {
		int sum = 0;
		for (int i = 1; i < number - 1; i++)
			if (number % i == 0)
				sum += i;
		return number == sum;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(PerfectNumberLBP041.perfectNumber(number));
	}

}
