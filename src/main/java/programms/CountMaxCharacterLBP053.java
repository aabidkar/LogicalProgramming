package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Count max character in a string
public class CountMaxCharacterLBP053 {
	static Logger logger = Logger.getLogger(CountMaxCharacterLBP053.class);

	static char countMaxCharacter(String text) {
		int[] a = new int[256];
		int i = 0;
		int m = 0;
		for (i = 0; i <= text.length() - 1; i++) {
			a[text.charAt(i)]++;
		}
		for (i = 0; i < 256; i++) {
			if (a[i] > a[m])
				m = i;
		}
		return (char) m;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(CountMaxCharacterLBP053.countMaxCharacter(text));

	}

}
