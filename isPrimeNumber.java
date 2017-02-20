import java.util.Scanner;

public class isPrimeNumber {

	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;

			}
		}
		return true;
	}

	public static void inputConformity(int theNum) {
		if (theNum >= 2) {
			System.out.println(isPrime(theNum));
		} else {
			System.out.println("Invalid input...");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number : ");
		inputConformity(scan.nextInt());
		scan.close();
	}
}