import java.util.Scanner;

public class isPalindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the input : ");
		String x = scan.nextLine();
		if (palindromes(x)) {
			System.out.println(x + " is palindrome");
		} else {
			System.out.println(x + " is not palindrome");
		}
		scan.close();

	}

	public static boolean palindromes(String a) {

		int low = 0;
		int high = a.length() - 1;

		while (low < high) {
			if (a.charAt(low) != a.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}

}
