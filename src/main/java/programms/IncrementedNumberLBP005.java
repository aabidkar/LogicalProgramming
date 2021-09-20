package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Return the next number from the integer passed
public class IncrementedNumberLBP005 {
	static Logger logger = Logger.getLogger(IncrementedNumberLBP005.class);

	static int incrementNumber(int number) {
		return ++number;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(IncrementedNumberLBP005.incrementNumber(number));
	}

}
