package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
The e-commerce company Bookshelf wishes to analyze its monthly sales data between minimum range 30 to max range 100. The company has categorized these book sales into four groups depending on the number of sales with the help of these groups the company will know which stock they should increase or decrease in their inventory for the next month. the groups are as follows

sales range		groups
30-50 ------------------> D
51-60 ------------------> C
61-80 ------------------> B
81-100 -----------------> A
 */
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
