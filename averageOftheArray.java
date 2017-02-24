import java.util.Scanner;

public class averageOftheArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Length of the array : ");
		int theLength = scan.nextInt();
		double array[] = new double[theLength];

		execution(array);
		scan.close();
	}

	public static void execution(double[] theNumber) {
		Scanner scan = new Scanner(System.in);
		double average = 0, total = 0;
		for (int i = 0; i < theNumber.length; i++) {
			System.out.print(i + 1 + ". number : ");
			theNumber[i] = scan.nextDouble();
			total += theNumber[i];

		}
		average = total / theNumber.length;
		int count = 0;

		for (int k = 0; k < theNumber.length; k++) {
			if (theNumber[k] > average) {
				count++;
			}
		}

		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average " + count);
		scan.close();
	}
}
