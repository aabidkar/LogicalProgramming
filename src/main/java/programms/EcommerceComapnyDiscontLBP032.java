package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
e-commerce company new year discount

An e-commerce company plans to give their customers a discount for the new years holiday. The discount will be calcualted on the basis of the bill amount of the order placed. The discount amount is the sum of all the odd digits in the customers total bill amount. if no odd digits is present in the bill amount, then discount will be zero.

input-> the input consists of an integer bill amount, representing the customers total bill amount.
output --> print an integer representing the discount for the given total bill amount.
constraint ---> n>0

Logic:
~~~~~~
1 ----------> read bill amount
2 ----------> extract digits from bill amount
3 ----------> sum of all odd digits
4 ----------> sum is nothing but discount
 */
public class EcommerceComapnyDiscontLBP032 {
	static Logger logger = Logger.getLogger(EcommerceComapnyDiscontLBP032.class);
	static int tempNumber = 0;
	static int sum = 0;

	static int companyDiscount(int billAmount) {
		while (billAmount != 0) {
			tempNumber = billAmount % 10;
			if (tempNumber % 2 == 1) {
				sum += tempNumber;
			}
			billAmount /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int billAmount = myObj.nextInt();
		logger.info(EcommerceComapnyDiscontLBP032.companyDiscount(billAmount));

	}

}