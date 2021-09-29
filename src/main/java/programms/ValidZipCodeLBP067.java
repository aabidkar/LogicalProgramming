package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
zipcodes consists of 5 consecutive digits. 
Given a string, write a function to determine whether the input is a valid zip code. 
a valid zipcode is as follows

1. must contain only numbers.
2. it should not contain any spaces.
3. length should be only 5.

input ------> A string
constraint -> no
output -----> true or false

11111 ----> true
4564 -----> false
123 4-----> false

Logic:
~~~~~~
1. read a string s from the user
2. for each digit increment counter.
3. if counter is 5, then it is valid
4. else it is invalid.

RE:

[aeiou]
[^aeiou]
[x|o]
[02468]
[^02468] or [13579]
[2357]
[0-9][0-9][0-9][0-9][0-9]
[0-9](5)
[6789][0-9](9)
 */
public class ValidZipCodeLBP067 {
	static Logger logger = Logger.getLogger(ValidZipCodeLBP067.class);

	static boolean validateZipCode(String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 48 && text.charAt(i) <= 57)
				count++;
		}
		return count == 5;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		logger.info(ValidZipCodeLBP067.validateZipCode(text));

	}

}
