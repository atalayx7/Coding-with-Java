import java.util.Scanner;

public class theCurrentTimeMillisec {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long theBeginning = System.currentTimeMillis();

		System.out.print("Ready? Let's press. --> " + (theBeginning - theBeginning) + "\nPlease hit the 'p' --> ");
		String x = scan.next();
		if (x == null || x.matches("p")) {
			long theEnd = System.currentTimeMillis();
			System.out.println("Totally : " + (theEnd - theBeginning) + " millisecond");

		} else {
			System.out.println("Invalid Input...");
			System.exit(0);
		}
	}

}
