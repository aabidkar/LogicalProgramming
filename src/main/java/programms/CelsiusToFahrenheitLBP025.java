package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Create a function/method to convert Celsius to Fahrenheit

input ------> Celsius
Constraint --> no
output -----> Fahrenheit

F = (C*9/5)+32
 */
public class CelsiusToFahrenheitLBP025 {
	static Logger logger = Logger.getLogger(CelsiusToFahrenheitLBP025.class);
	static int fahrenheit = 0;

	static int celsiusToFahrenheit(int celsius) {
		fahrenheit = ((celsius * 9 / 5) + 32);
		return fahrenheit;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int celsius = myObj.nextInt();
		logger.info(CelsiusToFahrenheitLBP025.celsiusToFahrenheit(celsius));

	}

}
