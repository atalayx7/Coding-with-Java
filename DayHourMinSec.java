
import java.util.Scanner;

/**
 * 
 * @author ${Atalay Samet Ergen}
 *
 */
public class DayHourMinSec {

	public static void timeCal(int second) {

		int sec, min, hour, day;

		sec = second % 60; // second
		min = second / 60; // second

		hour = min / 60;
		min = min % 60;

		day = hour / 24;
		hour = hour % 24;

		System.out.println(day + " day " + hour + " hour " + min + " minutes " + sec + " second.");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the second : ");
		int second = scan.nextInt();
		timeCal(second);
		scan.close();
	}

}
