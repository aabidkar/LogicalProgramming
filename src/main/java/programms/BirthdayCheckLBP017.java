package programms;

import java.util.Scanner;

import org.apache.log4j.Logger;

/*
Lisa always forgets her birthday which is on 5th July. 
So develop a function/method which will be helpful to remember her birthday.

The function/method checkBirthday return an integer 1, if it is her birthday else return 0. 
the function/method checkBirthday accepts two arguments.
Month, a string representing the month of her birth and 
day, an integer representing the date of her birthday.

input -----------> month & day 
constraints -----> no
output ----------> 1 or 0
 */
public class BirthdayCheckLBP017 {
	static Logger logger = Logger.getLogger(BirthdayCheckLBP017.class);

	static int birthdayCheck(String monthName, int date) {
		if ("july".equalsIgnoreCase(monthName) && date == 5) {
			return 1;
		} else
			return 0;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String monthName = myObj.nextLine();
		int date = myObj.nextInt();
		logger.info(BirthdayCheckLBP017.birthdayCheck(monthName, date));

	}

}
