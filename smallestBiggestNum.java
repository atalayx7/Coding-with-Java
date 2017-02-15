
/**
 * @author ${Atalay Samet Ergen}
 *
 */
import java.util.Scanner;

public class smallestBiggestNum {
	public static void bignsmallNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the length of the array : ");
		int number = scan.nextInt();

		int array[] = new int[number];
		int smallest = 0;
		int biggest = 0;

		for (int i = 0; i < number; i++) {
			System.out.println(i + 1 + ". number: ");
			array[i] = scan.nextInt();
			if (smallest > array[i]) {
				smallest = array[i];
			}
			if (biggest < array[i]) {
				biggest = array[i];
			}

		}
		System.out.println("The smallest number is " + smallest);
		System.out.println("The biggest number is " + biggest);

		scan.close();

	}

	public static void main(String[] args) {
		bignsmallNum();
	}

}
