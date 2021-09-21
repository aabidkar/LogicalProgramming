package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Oddish or Evenish

Create a function that determines whether a number is Oddish or Evenish. A number is Oddish if the sum of all of its digits is Odd, and number is Evenish if the sum of all of its digits is even, if a number is Oddish return Oddish else return Evenish.

input ----------> a number
constraint -----> n>0
output ---------> Oddish or Evenish

Logic:
~~~~~~
1 ---------> read a number
2 ---------> cal sum of its digits
3 ---------> if sum is even then print Evenish
4 ---------> else print Oddish

123 -----> 1+2+3=6 ----> even ----> Evenish
153 -----> 1+5+3=9 ----> Odd -----> Oddish
 */
public class OddishEvenishLBP043 {
	static Logger logger = Logger.getLogger(OddishEvenishLBP043.class);

	static String oddishEvenish(int number) {
		int tempNumber = 0;
		int sum = 0;
		while (number != 0) {
			tempNumber = number % 10;
			sum += tempNumber;
			number /= 10;
		}
		if (sum % 2 == 0)
			return "Evenish";
		else
			return "Oddish";
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(OddishEvenishLBP043.oddishEvenish(number));
	}

}
