package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

/*
Defanging an IP address

Given a valid IP address, return a defanged version of that IP address. A defanged IP address replaces every period '.' with "[.]".

input ----------> A string
constraint -----> non-empty String
output ---------> replacement String

1.1.1.1  ====> 1[.]1[.]1[.]1


Logic:
~~~~~~
1------> read a string value from the user
2 -----> replace . with [.]
 */
public class IPAddressLBP047 {
	static Logger logger = Logger.getLogger(IPAddressLBP047.class);

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String ipAddress = myObj.nextLine();
		logger.info(ipAddress.replace(".", "[.]"));
	}

}
