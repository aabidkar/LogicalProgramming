package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Sum of even number in a given range
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
