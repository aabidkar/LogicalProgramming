package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Hello and Bye
public class HelloByeLPB066 {
	static Logger logger = Logger.getLogger(HelloByeLPB066.class);

	static String helloBye(String text, int number) {
		if(number==1) {
			return "Hello "+ text;
		}
		else
			return "Bye "+ text;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		int number = myObj.nextInt();
		logger.info(HelloByeLPB066.helloBye(text, number));

	}

}
