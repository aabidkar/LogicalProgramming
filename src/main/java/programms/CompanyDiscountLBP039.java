package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
New year holiday discount

An e-Commerce company plans to give thier customers a discount for the newyears holiday. The discount will be calcualted on the basis of the bill amount of the order place. The discount amount is the product of the sum of all odd digits and the sum of all even digits of the customers total bill amount.

input ----> an integer bill amount, representing the total bill amount of the customer.
output ---> print an integer representing the discount amount for the given total bill.

Logic:
~~~~~~
1. read bill amount as an integer.
2. sum of even digits and sum of odd digits in the given number.
3. se and so, discount = se*so
4. print discount
 */
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
