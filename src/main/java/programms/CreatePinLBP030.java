package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Pin Generation
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
