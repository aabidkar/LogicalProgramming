package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;
//Leap Year
public class LeapYearLBP003 {
	static Logger logger = Logger.getLogger(LeapYearLBP003.class);

	static String learYear(int year) {
		if ((year % 4 == 0 && year % 100 != 1) && year % 400 == 0)
			return "Leap Year";
		else
			return "Not a Leap Year";
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int year = myObj.nextInt();
		logger.info(LeapYearLBP003.learYear(year));
	}
}
