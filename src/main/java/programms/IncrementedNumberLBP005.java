package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
implement a program that takes a number as an argument, increments the number by +1 and returns the result

input ----------> a number from the user
constraints-----> no constraints
output ---------> an incremented value

Logic: n -----> increment the value of n by one.
C ------------> ++ (pre|post)
C++ ----------> ++ (pre|post)
Java ---------> ++ (pre|post)
Python -------> we dn't have any increment operator n=n+1
 */
public class IncrementedNumberLBP005 {
	static Logger logger = Logger.getLogger(IncrementedNumberLBP005.class);

	static int incrementNumber(int number) {
		return ++number;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(IncrementedNumberLBP005.incrementNumber(number));
	}

}
