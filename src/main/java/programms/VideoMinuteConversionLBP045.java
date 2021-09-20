package programms;

import java.util.Scanner;
import org.apache.log4j.Logger;

//Video minutes to seconds converter
public class VideoMinuteConversionLBP045 {
	static Logger logger = Logger.getLogger(VideoMinuteConversionLBP045.class);

	static int videoMinutesConverter(String videoTime) {
		String[] time = videoTime.split(":"); // 02:01
		int number1 = 0;
		int number2 = 0;
		int minutes = 0;
		if (time[0].charAt(0) == '0')
			number1 = time[0].charAt(1) - 48;
		else
			number1 = time[0].charAt(0) - 48 * 10 + time[0].charAt(1) - 48;
		if (time[1].charAt(0) == '0')
			number2 = time[1].charAt(1) - 48;
		else
			number2 = time[1].charAt(0) - 48 * 10 + time[1].charAt(1) - 48;
		minutes = ((number1 * 60) + number2);
		return minutes;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String time = myObj.nextLine();
		logger.info(VideoMinuteConversionLBP045.videoMinutesConverter(time));

	}

}
