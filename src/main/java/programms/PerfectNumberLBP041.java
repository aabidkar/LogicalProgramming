package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Create a function that tests whether or not an integer is a perfect number. 
A perfect number is a number that can be written as sum of its factors. (equal to sum of its proper divisors) excluding the number itself.

input ------> a number from the user
constraint -> n>0
output -----> true or false

Eg:

6 =======> 1,2,3,6 ====> 1+2+3=6
8 =======> 1,2,4,8 ====> 1+2+4=7

Logic:
~~~~~
1. read a number from the user.
2. divide the number with numbers from 1 to n-1
3. if it is divisible (factor) add to sum variable.
4. check sum and original number are same or not
5. same print "perfect number" else "not"
7. true or false
 */
public class PerfectNumberLBP041 {
	static Logger logger = Logger.getLogger(PerfectNumberLBP041.class);

	static boolean perfectNumber(int number) {
		int sum = 0;
		for (int i = 1; i < number - 1; i++)
			if (number % i == 0)
				sum += i;
		return number == sum;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(PerfectNumberLBP041.perfectNumber(number));
	}

}
