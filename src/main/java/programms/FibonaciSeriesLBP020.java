package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;
//Fibonaci Series
public class FibonaciSeriesLBP020 {
	static Logger logger = Logger.getLogger(FibonaciSeriesLBP020.class);
	static int tempNumber = 0;

	static int fibonaciSeries(int number) {
		if (number == 0 || number == 1)
			return number;
		else
			return fibonaciSeries(number - 1) + fibonaciSeries(number - 2);
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(FibonaciSeriesLBP020.fibonaciSeries(number));
	}

}
