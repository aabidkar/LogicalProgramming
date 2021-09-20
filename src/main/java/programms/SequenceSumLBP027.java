package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Find the sequence sum
public class SequenceSumLBP027 {
	static Logger logger = Logger.getLogger(SequenceSumLBP027.class);
	static int sum = 0;

	static int sequenceSum(int first, int second, int third) {
		for (int i = first; i <= second; i++)
			sum += i;
		for (int j = second - 1; j >= third; j--)
			sum += j;
		return sum;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int first = myObj.nextInt();
		int second = myObj.nextInt();
		int third = myObj.nextInt();
		logger.info(SequenceSumLBP027.sequenceSum(first, second, third));

	}

}
