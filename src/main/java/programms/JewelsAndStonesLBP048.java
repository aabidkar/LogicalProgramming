package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Count the Stones in the Jewels
public class JewelsAndStonesLBP048 {
	static Logger logger = Logger.getLogger(JewelsAndStonesLBP048.class);

	static int stonesCount(String jewels, String stones) {
		int count = 0;
		for (int i = 0; i < stones.length(); i++) {
			for (int j = 0; j < jewels.length(); j++) {
				if (stones.charAt(i) == jewels.charAt(j))
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String jewels = myObj.nextLine();
		String stones = myObj.nextLine();
		logger.info(JewelsAndStonesLBP048.stonesCount(jewels, stones));

	}
}
