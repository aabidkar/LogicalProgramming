package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Create PIN using Three given numbers

"Secure Assets Private Ltd", a small company that deals with lockers has recently started manufacturing digital locks which can be locked and unlocked using PINs (passwords). You have been asked to work on the module that is expected to generate PINs using three input numbers.

The three given input numbers will always consist of three digits each 
i.e. each of them will be in the range >=100 and <=999.

Bellow are the rules for generating the PIN.

1. The PIN should made up of 4 digits.
2. The unit (ones) position of the PIN should be the least of the units position of the three numbers.
3. The tens position of the PIN should be the least of the tens position of the three input numbers.
4. The hundreds position of the PIN should be least of the hundreds position of the three numbers.
5. The thousands position of the PIN should be the max of all digits in the three input numbers.

input ----------> three numbers
constraints ----> all the numbers must be in the range of >=100 and <=999
output ---------> PIN value
 */
public class CreatePinLBP030 {
	static Logger logger = Logger.getLogger(CreatePinLBP030.class);

	static int max(int firstNumber, int secondNumber, int thirdNumber) {
		if (firstNumber > secondNumber && firstNumber > thirdNumber)
			return firstNumber;
		else if (secondNumber > thirdNumber)
			return secondNumber;
		else
			return thirdNumber;
	}

	static int min(int firstNumber, int secondNumber, int thirdNumber) {
		if(firstNumber < secondNumber && firstNumber < thirdNumber)
			return firstNumber;
		else if(secondNumber < thirdNumber)
			return secondNumber;
		else
			return thirdNumber;
	}

	static int maxDigit(int number) {
		int max = -9;
		int tempNumber = 0;
		while (number != 0) {
			tempNumber = number % 10;
			if (max < tempNumber)
				max = tempNumber;
			number /= 10;
		}
		return max;
	}

	static int pinGeneratino(int firstNumber, int secondNumber, int thirdNumber) {
		int a = min(firstNumber % 10, secondNumber % 10, thirdNumber % 10);
		int b = min((firstNumber / 10) % 10, (secondNumber / 10) % 10, (thirdNumber / 10) % 10);
		int c = min((firstNumber / 100) % 10, (secondNumber / 100) % 10, (thirdNumber / 100) % 10);
		int fourthNumber = max(maxDigit(firstNumber), maxDigit(secondNumber), maxDigit(thirdNumber));
		return fourthNumber * 1000 + c * 100 + b * 10 + a;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int firstNumber = myObj.nextInt();
		int secondNumber = myObj.nextInt();
		int thirdNumber = myObj.nextInt();
		logger.info(CreatePinLBP030.pinGeneratino(firstNumber, secondNumber, thirdNumber));
	}

}
