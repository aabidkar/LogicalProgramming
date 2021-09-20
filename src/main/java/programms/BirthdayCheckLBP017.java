package programms;

import java.util.Scanner;

import org.apache.log4j.Logger;

//Birthday Check
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
