package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;
/*
 Write a function that changes every letter to the next letter:

"a" becomes "b"
"b" becomes "c"
"d" becomes "e"
and so on ...
'x' becomes 'y'
'y' becomes 'z'
'z' becomes ''

note: there is no z's in test cases, be happy.

input ------> a string from the user
cons -------> no
output -----> modified string

Logic:
~~~~~~
1. read a string s from the user.
2. fetch char by char from s and print s+1 until if s is not equal to 'z'

abc ----> bcd

a=97+1=98->b
b=98+1=99->c
c=99+1=100->d
 */

public class NextLetterLBP073 {
	static Logger logger = Logger.getLogger(NextLetterLBP073.class);

	static void nextLetter(String text) {
		for (int i = 0; i < text.length(); i++)
			if (text.charAt(i) != 'z')
				logger.info((char)(text.charAt(i)+1));
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String text = myObj.nextLine();
		NextLetterLBP073.nextLetter(text);

	}

}
