import java.util.Scanner;

public class reverseTheNumber {

	public static void reversing(int num) {
		int number;
		Scanner scan = new Scanner(System.in);

		while (num <= 0) {
			System.out.println("Invalid, Try again");
			num = scan.nextInt();
		}
		while (num > 0) {

			number = num % 10;
			System.out.print(number);
			num -= number;
			num /= 10;

		}
		scan.close();

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		System.out.print("A positive number: ");
		x = scan.nextInt();
		reversing(x);
		scan.close();
	}

}
