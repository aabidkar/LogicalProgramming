package programms;

import java.util.Scanner;

import org.apache.log4j.Logger;
/*
Program to read a number and check whether it is duck number or not.

A duck number is a number which has zeros present in it, but no zero present in the begining of the number.

input-------> a number from the user
Constraint --> n>=0
output------> Yes or No


Logic:
------
1. extract digits one by one 
2. and check whether d==0 or not 
3. if d==0 then res=Yes and terminate
4. res=False 
5. print res
 */
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
