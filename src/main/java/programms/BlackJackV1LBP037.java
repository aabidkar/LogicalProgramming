package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Black Java Version One
public class BlackJackV1LBP037 {
	static Logger logger = Logger.getLogger(BlackJackV1LBP037.class);

	static int blackJack(int numberOne, int numberTwo) {
		if (numberOne > 21 && numberTwo > 21)
			return 0;
		else if (numberOne > 21)
			return numberTwo;
		else if (numberTwo > 21)
			return numberOne;
		else
			return (numberOne > numberTwo) ? numberOne : numberTwo;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int numberOne = myObj.nextInt();
		int numberTwo = myObj.nextInt();
		logger.info(BlackJackV1LBP037.blackJack(numberOne, numberTwo));
	}

}