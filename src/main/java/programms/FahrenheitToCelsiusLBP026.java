package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Program to convert fahrenheit to celsius.

input -------> fahrenheit
constraint --> no
output ------> celsius

formula: (F-32)*5/9
 */
public class FahrenheitToCelsiusLBP026 {
	static Logger logger = Logger.getLogger(FahrenheitToCelsiusLBP026.class);
	static int celsius = 0;

	static int fahrenheitToCelsius(int fahrenheit) {
		celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int fahrenheit = myObj.nextInt();
		logger.info(FahrenheitToCelsiusLBP026.fahrenheitToCelsius(fahrenheit));

	}

}
