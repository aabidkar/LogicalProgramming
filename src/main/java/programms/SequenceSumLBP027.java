package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;
/*
Climbing Stairs
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. 
In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

input --------> a number from the user
Constraints --> no
output -------> number of ways

1----> 1
2 ---> 2
3 ---> 3
4 ---> 5
.
.

1 ----> 1
2 ----> 2
3 ----> 3
4 ----> 5
 */
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
