package programms;

import java.util.Scanner;

import org.apache.log4j.Logger;
//Number Even or Odd
public class NumberWeirdNotWeirdLBP002 {
	static Logger logger = Logger.getLogger(NumberWeirdNotWeirdLBP002.class);

	static String numberWeirdNotWeird(int number) {
		if (number >= 0 && number <= 100) {
			if (number % 2 == 1)
				return "Weird";
			else {
				if (number >= 2 && number <= 5)
					return "Not Weird";
				else if (number >= 6 && number <= 20)
					return "Weird";
				else
					return "Not Weird";
			}
		} else
			return "Out of Range Number";
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(NumberWeirdNotWeirdLBP002.numberWeirdNotWeird(number));
	}

}
