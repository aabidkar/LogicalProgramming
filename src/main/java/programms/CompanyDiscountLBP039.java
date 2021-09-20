package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Company discount
public class CompanyDiscountLBP039 {
	static Logger logger = Logger.getLogger(CompanyDiscountLBP039.class);
	static int tempNumber = 0;
	static int evenNumber = 0;
	static int oddNumber = 0;
	static int discount = 0;

	static int companyDiscount(int number) {
		while (number != 0) {
			tempNumber = number % 10;
			if (tempNumber % 2 == 0)
				evenNumber += tempNumber;
			else
				oddNumber += tempNumber;
			number /= 10;
		}
		discount = evenNumber * oddNumber;
		return discount;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(CompanyDiscountLBP039.companyDiscount(number));

	}

}
