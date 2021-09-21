package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
War of Numbers

There is a great war between the even and odd numbers. Many numbers already lost thier life in this war and its your task to end this. You have to determine which group sums larger. the even, or the odd, the larger group wins. Create a function that takes an array of integers , sums the even and odd numbers seperately, then return the difference between sum of even and odd numbers.

Note: if result is -ve convert it into +ve.

input --------> number and array elements
constraint ---> no
output -------> difference between sum of even and odd numbers


Logic:
~~~~~~~
1 ------------> read array size
2 ------------> read the elements
3 ------------> sum of even elements and sum of odd elements
4 ------------> diff = sum of even - sum of odd elements
5 ------------> if diff>0 then print diff else -diff

 */
public class SumOfEvenOddArrayLBP040 {
	static Logger logger = Logger.getLogger(SumOfEvenOddArrayLBP040.class);

	static int war(int[] a, int number) {
		int evenSum = 0;
		int oddSum = 0;
		int diff = 0;
		for (int i = 0; i < number; i++) {
			if (a[i] % 2 == 0)
				evenSum += a[i];
			else
				oddSum += a[i];
		}
		diff = evenSum - oddSum;
		if (diff < 0)
			return -diff;
		else
			return diff;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int myArray = myObj.nextInt();
		int[] warArray = new int[myArray];
		for (int i = 0; i < myArray; i++) {
			warArray[i] = myObj.nextInt();
		}
		logger.info(SumOfEvenOddArrayLBP040.war(warArray, myArray));

	}

}
