package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Find the Bomb text in a given string
public class FindTheBombLBP055 {
	static Logger logger = Logger.getLogger(FindTheBombLBP055.class);

	static String findTheBomb(String text, String bomb) {
		int count = 0;
		int i = 0;
		text = text.toLowerCase();
		for (i = 0; i < text.length(); i++) {
			for (int j = 0; j < bomb.length(); i++, j++) {
				if (bomb.charAt(j) != text.charAt(i)) {
					break;
				}
				count++;
			}
		}
		if (count == bomb.length())
			return "DUCK";
		else
			return "Relax, there is no Bomb.";
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		String bomb = "bomb";
		logger.info(FindTheBombLBP055.findTheBomb(text, bomb));
	}
}
