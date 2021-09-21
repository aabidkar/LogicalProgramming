package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Program to check whether the given number is paliandrome or not

A number is said to paliandrome if it is equal to the original number.

input -----> a number from the user
constraint-> n>0
output ----> Yes or No

Logic:
------
1. read a number from the user.
2. Calculate reverse value
	r=0
	while(n!=0)
	{
		d=n%10;
		r=r*10+d;
		n=n/10;
	}
3. we have to compare original number and reversed number.
4. if both are same print Yes or No
 */
public class PaliandromeNumberLBP016 {
	static Logger logger = Logger.getLogger(PaliandromeNumberLBP016.class);
	static int tempNumber = 0;
	static int reverse = 0;
	static int originalNumber = 0;

	static String paliandromeNumber(int number) {
		originalNumber = number;
		while (number != 0) {
			tempNumber = number % 10;
			reverse = reverse * 10 + tempNumber;
			number /= 10;
		}
		logger.info(reverse);
		if (originalNumber == reverse)
			return "Paliandrome Number";
		else
			return "Not a Paliandrome Number";
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(PaliandromeNumberLBP016.paliandromeNumber(number));

	}

}
