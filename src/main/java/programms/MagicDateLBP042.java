package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Check whether data is magic date or not
public class MagicDateLBP042 {
	static Logger logger = Logger.getLogger(MagicDateLBP042.class);

	static boolean magicDate(int day, int month, int year) {
		int tempNumber = 0;
		tempNumber = day * month;
		return tempNumber == year % 10 || tempNumber == year % 100 || tempNumber == year % 1000;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int day = myObj.nextInt();
		int month = myObj.nextInt();
		int year = myObj.nextInt();
		logger.info(MagicDateLBP042.magicDate(day, month, year));

	}
}