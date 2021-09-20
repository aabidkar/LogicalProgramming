package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Niven number
public class NivenNumberLBP022 {
	static Logger logger = Logger.getLogger(NivenNumberLBP022.class);
	static int tempNumber = 0;
	static int sum = 0;
	static int copyNumber = 0;

	static String nivenNumber(int number) {
		copyNumber = number;
		while (copyNumber != 0) {
			tempNumber = copyNumber % 10;
			sum += tempNumber;
			copyNumber /= 10;
		}
		if (number % sum == 0)
			return "Niven Number";
		else
			return "Not a Niven Number";
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(NivenNumberLBP022.nivenNumber(number));

	}

}
