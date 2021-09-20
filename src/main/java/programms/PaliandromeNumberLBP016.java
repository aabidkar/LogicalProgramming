package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Palindrome Number
public class PaliandromeNumberLBP016 {
	static Logger logger = Logger.getLogger(PaliandromeNumberLBP016.class);
	static int tempNumber = 0;
	static int reverse = 0;
	static int originalNumber = 0;

	static String paliandromeNumber(int number) {
		originalNumber = number;
		while (number != 0) {
			tempNumber = number % 10;
			reverse = reverse * 10 + tempNumber;
			number /= 10;
		}
		logger.info(reverse);
		if (originalNumber == reverse)
			return "Paliandrome Number";
		else
			return "Not a Paliandrome Number";
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(PaliandromeNumberLBP016.paliandromeNumber(number));

	}

}
