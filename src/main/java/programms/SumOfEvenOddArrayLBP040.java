package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Sum of Even & Odd number in an Array
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
