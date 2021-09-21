package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;
/*

An e-commerce web site wishes to find the lucky customer who will be eligible for full value cash back. 
For this purpose,a number N is fed to the system. 
It will return another number that is calculated by an algorithm. 
In the algorithm, a sequence is generated, in which each number n the sum of the preceding numbers. initially the sequence will have two 1's in it. 
1,1,2,3,5,8......
The System will return the Nth number from the generated sequence which is treated as the order ID. The lucky customer will be one who has placed that order. 
Write an algorithm to help the web site find the lucky customer.

input --------> a number
constraint ---> n>0
output -------> a number

8---->21

fiboanaci sequence

0,1,1,2

0====>0
1====>1
2====>0+1=1
3====>1+1=2
4====>1+2=3
5====>2+3=5
6====>3+5=8
7====>5+8=13
8====>8+13=21
 */
public class FibonaciSeriesLBP020 {
	static Logger logger = Logger.getLogger(FibonaciSeriesLBP020.class);
	static int tempNumber = 0;

	static int fibonaciSeries(int number) {
		if (number == 0 || number == 1)
			return number;
		else
			return fibonaciSeries(number - 1) + fibonaciSeries(number - 2);
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		logger.info(FibonaciSeriesLBP020.fibonaciSeries(number));
	}

}
