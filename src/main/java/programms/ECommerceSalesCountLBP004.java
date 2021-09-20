package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;
//eCommerce Company sales count
public class ECommerceSalesCountLBP004 {

	static Logger logger = Logger.getLogger(ECommerceSalesCountLBP004.class);

	static String salesCount(int salesCount) {
		if (salesCount >= 30 && salesCount <= 100) {
			if (salesCount >= 30 && salesCount <= 50)
				return "D";
			else if (salesCount >= 51 && salesCount <= 60)
				return "C";
			else if (salesCount >= 61 && salesCount <= 70)
				return "B";
			else
				return "A";
		} else
			return "Invalid Sales Count";

	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int salesCount = myObj.nextInt();
		logger.info(ECommerceSalesCountLBP004.salesCount(salesCount));
	}

}
