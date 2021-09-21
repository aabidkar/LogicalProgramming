package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Shuffle String

Given a string s, and an integer array indices of the same length. 
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string, 
return shuffled string.

input ---------> a string and an array
constraint ----> no
output --------> a string


s=art
  012
a=102
  012

ts=0=>r 1=>a 2=>t

Logic:
~~~~~~
1------------> read a string
2------------> read an array with indices
3------------> create an array with the following formula ===> ts[a[i]]=s[i]

ts[a[i]]=s[i]
ts[a[0]]=s[0] ====> ts[1]=s[0]====>ts[1]=a
ts[a[1]]=s[1] ====> ts[0]=s[1]====>ts[0]=r
ts[a[2]]=s[2] ====> ts[2]=s[2]====>ts[2]=t

ts[0],ts[1],ts[2] ===> rat
 */
public class ShuffleStringLBP049 {
	static Logger logger = Logger.getLogger(ShuffleStringLBP049.class);

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String source = myObj.nextLine();
		int[] a = new int[source.length()];
		for (int i = 0; i < source.length(); i++)
			a[i] = myObj.nextInt();
		char[] b = new char[source.length()];
		for (int i = 0; i < source.length(); i++) {
			b[a[i]] = source.charAt(i);
		}
		logger.info(new String(b));
	}
}
