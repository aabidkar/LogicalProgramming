package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Implement a program to find sum of even number between x and y both are inclusive.

input -----> two int values
constraint-> no
output ----> sum of even numbers between x and y

Logic:
------
step1 ----> read x & y values from the user
step2 ----> repeat a loop from x to y both are inclusive (<=) [exclusive<]
step3 ----> check every number if it is even then add to sum
step4 ----> return sum
 */
public class SumOfEvenRangeLBP024 {
	static Logger logger = Logger.getLogger(SumOfEvenRangeLBP024.class);
	static int sum = 0;

	static int sumOfEvenRange(int numberOne, int numberTwo) {
		for (int i = numberOne; i <= numberTwo; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int numberOne = myObj.nextInt();
		int numberTwo = myObj.nextInt();
		logger.info(SumOfEvenRangeLBP024.sumOfEvenRange(numberOne, numberTwo));
	}

}
