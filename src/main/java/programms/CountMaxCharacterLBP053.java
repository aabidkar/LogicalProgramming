package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Given a string, implement a program to find max occurring character in the given string

input -------> A string from the user.
constraints--> No
output ------> max occurring character

welcome ----> e 
java -------> a

Logic:
~~~~~~~
1. read a string s
2. create an array with 256 values (0-255)
3. read each character and store corresponding entry in array
4. max counter in array
5. print its character

abababca

a[0]=0
.
.
a[97]=4
a[98]=3
a[99]=1
.
.
.
.
a[255]=0c
 */
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
