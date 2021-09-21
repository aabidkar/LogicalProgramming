package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;
/*
To check whether the given year is leap year or not.

input------> year from the user
constraint-> no constraint
output-----> leap year or not leap year

hint: for century year if it is divisible by 400 then only it is leap year

Logic:

i f (year %4==0 and year %100!=0) or year %400==0

True

else

False
 */
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
