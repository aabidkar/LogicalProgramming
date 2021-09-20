package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//IP Address replace . with [.]
public class IPAddressLBP047 {
	static Logger logger = Logger.getLogger(IPAddressLBP047.class);

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String ipAddress = myObj.nextLine();
		logger.info(ipAddress.replace(".", "[.]"));
	}

}
