package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Sum of digits between two numbers

Create a function that sums the total number of digits between two numbers inclusive. for example, if the numbers are 19 and 22, then (1+9)+(2+0)+(2+1)+(2+2)=19.

input ----------> two numbers from the user
constraints ----> no
output ---------> sum of digits between n1 and n2

Logic:
~~~~~~
1 -----------> read n1 and n2
2 -----------> run a loop fron n1 to n2
3 -----------> cal sum of digits between the number n1 and n2 and store result in s
4 -----------> print sum
 */
public class SumOfDigitsBetweenLBP046 {
	static Logger logger = Logger.getLogger(SumOfDigitsBetweenLBP046.class);

	static int sumOfDigits(int number) {
		int tempNumber = 0;
		int sum = 0;
		while (number != 0) {
			tempNumber = number % 10;
			sum += tempNumber;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int numberOne = myObj.nextInt();
		int numberTwo = myObj.nextInt();
		int sum = 0;
		for (int i = numberOne; i <= numberTwo; i++) {
			sum += sumOfDigits(i);
		}
		logger.info(sum);
	}

}
