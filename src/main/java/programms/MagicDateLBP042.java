package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Program to read date, month and year from the user and check whether it is magic date or not. Here are the rules for magic date.

dd-mm-yyyy
dd/mm/yyyy
dd mm yyyy ----> C lang

1) mm*dd is a 1-digit number that matches the last digit in YYYY
2) mm*dd is a 2-digit number that matches the last two digits in YYYY
3) mm*dd is a 3-digit number that matches the last three digits in YYYY

1-1-2001 ===> 1*1=1
1-1-2002 ===> 1*1=1
5-2-2010 ===> 5*2=10

input --------> three int values
constraint----> no
output -------> true or false

Logic:
~~~~~~
1 -------> read dd,mm and yyyy
2 -------> multiply dd*mm
3 -------> if the result is ending at yyyy ----> magic date
4 -------> else not magic date
 */
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