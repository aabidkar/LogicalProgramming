package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
For each of the 6 coffee cups I buy, I get a 7th cup free. In total, I get 7 cups. 
Implement a program that takes n cups bought and print as an integer the total number of cups I would get.

input -------------> n number of cups from user
constraints -------> n>0
output ------------> number of cups present have


2 --------> 2
6 --------> 7
12 -------> 14 etc

Logic: number of cups bought + free cups [n/6] ===> n+(n/6)
 */
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
