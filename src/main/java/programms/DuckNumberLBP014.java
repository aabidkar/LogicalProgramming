package programms;

import java.util.Scanner;

import org.apache.log4j.Logger;
//Duck number
public class DuckNumberLBP014 {
	static Logger logger = Logger.getLogger(DuckNumberLBP014.class);
	static int tempNumber = 0;
	static int reverse = 0;

	static boolean duckNumber(int number) {
		while (number != 0) {
			tempNumber = number % 10;
			if (tempNumber == 0)
				return true;
			number /= 10;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(DuckNumberLBP014.duckNumber(number));

	}

}
