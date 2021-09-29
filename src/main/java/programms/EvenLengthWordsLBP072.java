package programms;

import java.util.Scanner;
import java.util.StringTokenizer;
import org.apache.log4j.Logger;
/*
Write a program to print even length words in a string?

input -----> a string from the user
con -------> no
output ----> list of strings with even length

hello welcome to java ----> to java
a ab abc abcd abcde abcdef --> ab abcd abcdef

Logic:
------
1. read a sentence from the user as s.
2. fetch one by one token from string s.
3. check the length of the token is even or not
4. if even print that token
5. else continue
 */

public class EvenLengthWordsLBP072 {
	static Logger logger = Logger.getLogger(EvenLengthWordsLBP072.class);

	static void evenLengthWords(String text) {
		StringTokenizer st = new StringTokenizer(text);
		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			if (s.length() % 2 == 0) {
				logger.info(s + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		EvenLengthWordsLBP072.evenLengthWords(text);

	}

}
