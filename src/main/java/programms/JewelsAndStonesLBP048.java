package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Jewels and Stones

You are given Strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
Each character in stones is a type of stone you have 
you want to know how many of the stones you have are also jewels.

Letter are case sensitive. so "a" is considered as a different type of stone from "A".

input ------> A string
constriant -> no
output -----> how many of the stones

J="aA"
S="aAAbbbb"
1+2=3

Logic:
~~~~~~
1 -------> read the values of J and S
2 -------> read every char from J and check whether it is in S or not.
3 -------> if it is available, then increment the counter
4 -------> print counter
 */
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
