
import java.util.Scanner;

/**
 * @author ${Atalay Samet Ergen}
 *
 */
public class sortingTheArray {

	public static void sortTheArray(int thelength) {
		Scanner scan = new Scanner(System.in);

		int[] array = new int[thelength];
		int temp;
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + ". number : ");
			array[i] = scan.nextInt();
		}
		for (int j = 1; j < array.length; j++) {
			for (int i = 0; i < array.length - j; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + "  ");
		}
		System.out.println("");
		scan.close();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("This is a program that sorts numbers from small to large in an array"
				+ "\nWhat is gonna be the length of your array : ");
		int theLength = scan.nextInt();
		sortTheArray(theLength);
		scan.close();

	}

}
