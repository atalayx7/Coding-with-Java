import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {

	public static void numbergame() {
		Scanner scan = new Scanner(System.in);
		Random rdn = new Random();

		int random = rdn.nextInt(100) + 1;
		int dif = 0, counter = 0;

		do {
			System.out.print("Guess the number : ");
			int number = scan.nextInt();
			dif = Math.abs(random - number);
			counter++;
			if (dif <= 5 && dif > 0)
				System.out.println("Hot");
			else if (dif <= 15 && dif > 5)
				System.out.println("Warm");
			else if (dif <= 25 && dif > 15)
				System.out.println("Normal");
			else if (dif <= 35 && dif > 25)
				System.out.println("Cold");
			else if (dif <= 45 && dif > 35)
				System.out.println("Too Cold");
			else if (dif > 45)
				System.out.println("You are too far away...");
		} while (dif != 0 && counter < 10);
		if (dif == 0) {
			System.out.println("Great! You fond it at " + counter + ". trying.");
		} else {
			System.out.println("Ops! Game Over, You could not find it...");
		}
		scan.close();

	}

	public static void main(String[] args) {
		numbergame();

	}
}