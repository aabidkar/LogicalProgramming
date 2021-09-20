package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Shuffle String
public class ShuffleStringLBP049 {
	static Logger logger = Logger.getLogger(ShuffleStringLBP049.class);

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String source = myObj.nextLine();
		int[] a = new int[source.length()];
		for (int i = 0; i < source.length(); i++)
			a[i] = myObj.nextInt();
		char[] b = new char[source.length()];
		for (int i = 0; i < source.length(); i++) {
			b[a[i]] = source.charAt(i);
		}
		logger.info(new String(b));
	}
}
