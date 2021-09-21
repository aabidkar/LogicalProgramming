package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Say "Hello" Say "Bye"

Write a function that takes a string name and number num (either 1 or 0) and 
return "Hello"+name if number is 1, 
otherwise "Bye"+name.

input ------> a string from the user
constraint -> no
output -----> a string

prakash,1 -----> Hello prakash
java,0 --------> Bye java
python,1 ------> Hello python

Logic:
~~~~~~
1. read a string from the user as s
2. read a number from the user as num
3. if num is 1 then print "Hello" + s
4. if num is 0 then print "Bye" s
 */
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
