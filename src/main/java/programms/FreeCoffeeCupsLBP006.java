package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Free coffee cups
public class FreeCoffeeCupsLBP006 {
	static Logger logger = Logger.getLogger(FreeCoffeeCupsLBP006.class);

	static int freeCoffeeCups(int coffeeCups) {
		coffeeCups += coffeeCups / 6;
		return coffeeCups;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int coffeeCups = myObj.nextInt();
		logger.info(FreeCoffeeCupsLBP006.freeCoffeeCups(coffeeCups));
	}
}
