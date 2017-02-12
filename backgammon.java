
/**
 * 
 * @author ${Atalay Samet Ergen}
 *
 */
import java.util.Random;
import java.util.Scanner;

public class backgammon {
	public static void backgammonGame() {

		Scanner scan = new Scanner(System.in);
		Random rdn = new Random();

		int zarList[] = { 0, 0, 0, 0, 0, 0 };
		int number;
		for (int i = 0; i < 10000; i++) {
			number = rdn.nextInt(6) + 1;
			if (number == 1)
				zarList[0] += 1;
			else if (number == 2)
				zarList[1] += 1;
			else if (number == 3)
				zarList[2] += 1;
			else if (number == 4)
				zarList[3] += 1;
			else if (number == 5)
				zarList[4] += 1;
			else if (number == 6)
				zarList[5] += 1;
		}
		System.out.println("ZAR NO:\tHOW MANY TIMES:");
		System.out.println("1\t" + zarList[0]);
		System.out.println("2\t" + zarList[1]);
		System.out.println("3\t" + zarList[2]);
		System.out.println("4\t" + zarList[3]);
		System.out.println("5\t" + zarList[4]);
		System.out.println("6\t" + zarList[5]);
		scan.close();
	}

	public static void main(String[] args) {
		backgammonGame();
	}
}
