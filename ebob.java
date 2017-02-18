import java.util.Scanner;

public class ebob {
	static int gcd = 1;

	public static void theEBOB(int n1, int n2) {

		int k = 2;
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
			k++;
		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer : ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer : ");
		int n2 = input.nextInt();
		theEBOB(n1, n2);
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
		input.close();
	}
}