package programms;

import java.util.Scanner;

import org.apache.log4j.Logger;

//Number of occurrence in a particular number
public class NumberOfOccuranceLBP015 {
	static Logger logger = Logger.getLogger(NumberOfOccuranceLBP015.class);
	static int tempNumber = 0;
	static int count = 0;

	static int numberOfOccurance(int number, int numberToFind) {
		while (number != 0) {
			tempNumber = number % 10;
			if (tempNumber == numberToFind)
				count++;
			number /= 10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		int numberToFind = myObj.nextInt();
		logger.info(NumberOfOccuranceLBP015.numberOfOccurance(number, numberToFind));

	}

}
