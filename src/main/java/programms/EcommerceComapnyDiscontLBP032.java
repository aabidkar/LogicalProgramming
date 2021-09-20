package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//eComernce Company discount
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