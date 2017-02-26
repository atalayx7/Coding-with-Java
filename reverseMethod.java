import java.util.Scanner;

public class reverseMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String theInput = scan.nextLine();
		for (String part : theInput.split(" ")) {
			StringBuilder x = new StringBuilder(part);

			System.out.print(x.reverse() + " ");

		}
		scan.close();
	}

}
