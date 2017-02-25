
public class militaryVstandartTime {

	public static void main(String[] args) {

		convertingMilitaryTime x = new convertingMilitaryTime();

		System.out.println("Before start --> " + x.toMilitary() + "\n");

		x.setTime(3, 4, 5);
		System.out.println(x.toMilitary());
		System.out.println(x.toString() + "\n");

		x.setTime(7, 15, 56);
		System.out.println(x.toMilitary());
		System.out.println(x.toString() + "\n");

		x.setTime(13, 27, 6);
		System.out.println(x.toMilitary());
		System.out.println(x.toString());
	}
}

class convertingMilitaryTime {

	private int hour;
	private int minute;
	private int second;

	public void setTime(int h, int m, int s) {
		hour = ((h < 24 && h >= 0) ? h : 0);
		minute = ((m < 60 && m >= 0) ? m : 0);
		second = ((s < 60 && s >= 0) ? s : 0);
	}

	public String toMilitary() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : (hour % 12)), minute, second,
				((hour > 12) ? "PM" : "AM"));

	}
}
